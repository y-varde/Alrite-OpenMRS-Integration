package com.ug.air.alrite.Worker;

import static android.content.Context.MODE_PRIVATE;
import static android.content.Context.NOTIFICATION_SERVICE;
import static android.content.Context.VIBRATOR_SERVICE;

import static com.ug.air.alrite.Activities.PatientActivity.INCOMPLETE;
import static com.ug.air.alrite.Fragments.Patient.Bronchodilator.BRONCHODILATOR;
import static com.ug.air.alrite.Fragments.Patient.Bronchodilator.DATE;
import static com.ug.air.alrite.Fragments.Patient.Bronchodilator2.REASON;
import static com.ug.air.alrite.Fragments.Patient.Bronchodilator3.BRONC;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.ug.air.alrite.BuildConfig;
import com.ug.air.alrite.Models.Item;
import com.ug.air.alrite.Models.Patient;
import com.ug.air.alrite.R;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NotifyWorker2 extends Worker {

    private NotificationManager notificationManager;
    File[] contents;
    MediaPlayer mediaPlayer;
    AudioManager audioManager;
    Uri alarmSound;
    Vibrator vibrator;
    String s, progress;
    int value = 0;

    public NotifyWorker2(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        notificationManager = (NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
        alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), alarmSound);
        vibrator = (Vibrator) getApplicationContext().getSystemService(VIBRATOR_SERVICE);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @NonNull
    @Override
    public Result doWork() {
        readData();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.stop();
            }
        });
        return Result.success();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void readData() {
        Date currentTime = Calendar.getInstance().getTime();
        File src = new File("/data/data/" + BuildConfig.APPLICATION_ID + "/shared_prefs");
        if (src.exists()){
            contents = src.listFiles();
            if (contents.length != 0) {
                for (File f : contents) {
                    if (f.isFile()) {
                        String name = f.getName().replace(".xml", "");
                        if (!name.equals("sharedPrefs")){
                            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(name, MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            String bron = sharedPreferences.getString(BRONCHODILATOR, "");
                            String fin = sharedPreferences.getString(BRONC, "");
                            String incomplete = sharedPreferences.getString(INCOMPLETE, "");
                            if (incomplete.isEmpty() && bron.equals("Bronchodialtor Given") && fin.isEmpty()){
                                String date = sharedPreferences.getString(DATE, "");
                                try {
                                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                                    Date newDate = df.parse(date);
                                    long diff = currentTime.getTime() - newDate.getTime();
                                    long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
                                    if (minutes >= 30 && minutes < 240){
                                        value = value + 1;
                                    }else if (minutes >= 240){
                                        editor.putString(BRONCHODILATOR, "Bronchodialtor Not Given");
                                        editor.putString(REASON, "A 4 hour time period elapsed");
                                        editor.apply();
                                    }
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                            }
                        }

                    }
                }
                Log.d("Background Task", "Executed successfully");
                audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
                switch (audioManager.getRingerMode()){
                    case AudioManager.RINGER_MODE_NORMAL:
                        mediaPlayer.start();
                        break;
                    case AudioManager.RINGER_MODE_SILENT:
                        break;
                    case AudioManager.RINGER_MODE_VIBRATE:
                        vibrator.vibrate(VibrationEffect.createOneShot(1000, VibrationEffect.DEFAULT_AMPLITUDE));
                        break;
                }
                if (value > 0) {
                    if (value == 1){
                        s = "There is one patient ready for reassessment";
                    }else {
                        s = "There are " + value + " patients ready for reassessment";
                    }
                    createForegroundInfo(s);
                }

            }
        }
    }

    private void createForegroundInfo(@NonNull String progress) {
        // Build a notification using bytesRead and contentLength

        Context context = getApplicationContext();
        String id = "alright_1";
        String title = "Other Patients Ready for Reassessment";
        String cancel = "Cancel";
        // This PendingIntent can be used to cancel the worker
        PendingIntent intent = WorkManager.getInstance(context)
                .createCancelPendingIntent(getId());

//        Intent intent1 = new Intent(context, Bronchodilator.class);
//        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        PendingIntent contentIntent = PendingIntent.getActivity(context, 0, intent1, 0);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            createChannel();
        }

        NotificationCompat.Builder notification = new NotificationCompat.Builder(context, id)
                .setContentTitle(title)
                .setSmallIcon(R.drawable.alrite_logo)
                .setContentText(progress)
                .setAutoCancel(true)
//                .setContentIntent(contentIntent)
                .addAction(android.R.drawable.ic_delete, cancel, intent);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getApplicationContext());
        notificationManagerCompat.notify(4, notification.build());
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private void createChannel() {
        // Create a Notification channel
        CharSequence name = "Worker Channel";
        String description = progress;
        int importance = NotificationManager.IMPORTANCE_DEFAULT;
        NotificationChannel channel = new NotificationChannel("alright_1", name, importance);
        channel.setDescription(description);
        // Register the channel with the system; you can't change the importance
        // or other notification behaviors after this
        notificationManager.createNotificationChannel(channel);

    }
}
