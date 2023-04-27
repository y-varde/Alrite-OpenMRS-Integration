// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class ActivityFinalBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CheckBox antibiotics;

  @NonNull
  public final Button btnExit;

  @NonNull
  public final CheckBox cough;

  @NonNull
  public final CheckBox inhaled;

  @NonNull
  public final CheckBox oral;

  @NonNull
  public final CheckBox other;

  @NonNull
  public final CheckBox other2;

  @NonNull
  public final EditText otherText;

  @NonNull
  public final EditText otherText2;

  @NonNull
  public final CheckBox pneumonia;

  @NonNull
  public final CheckBox referral;

  @NonNull
  public final CheckBox severe;

  @NonNull
  public final CheckBox steroids;

  @NonNull
  public final ScrollView summary1;

  @NonNull
  public final CheckBox supportive;

  @NonNull
  public final CheckBox wheezing;

  private ActivityFinalBinding(@NonNull LinearLayout rootView, @NonNull CheckBox antibiotics,
      @NonNull Button btnExit, @NonNull CheckBox cough, @NonNull CheckBox inhaled,
      @NonNull CheckBox oral, @NonNull CheckBox other, @NonNull CheckBox other2,
      @NonNull EditText otherText, @NonNull EditText otherText2, @NonNull CheckBox pneumonia,
      @NonNull CheckBox referral, @NonNull CheckBox severe, @NonNull CheckBox steroids,
      @NonNull ScrollView summary1, @NonNull CheckBox supportive, @NonNull CheckBox wheezing) {
    this.rootView = rootView;
    this.antibiotics = antibiotics;
    this.btnExit = btnExit;
    this.cough = cough;
    this.inhaled = inhaled;
    this.oral = oral;
    this.other = other;
    this.other2 = other2;
    this.otherText = otherText;
    this.otherText2 = otherText2;
    this.pneumonia = pneumonia;
    this.referral = referral;
    this.severe = severe;
    this.steroids = steroids;
    this.summary1 = summary1;
    this.supportive = supportive;
    this.wheezing = wheezing;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFinalBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFinalBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_final, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFinalBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.antibiotics;
      CheckBox antibiotics = rootView.findViewById(id);
      if (antibiotics == null) {
        break missingId;
      }

      id = R.id.btnExit;
      Button btnExit = rootView.findViewById(id);
      if (btnExit == null) {
        break missingId;
      }

      id = R.id.cough;
      CheckBox cough = rootView.findViewById(id);
      if (cough == null) {
        break missingId;
      }

      id = R.id.inhaled;
      CheckBox inhaled = rootView.findViewById(id);
      if (inhaled == null) {
        break missingId;
      }

      id = R.id.oral;
      CheckBox oral = rootView.findViewById(id);
      if (oral == null) {
        break missingId;
      }

      id = R.id.other;
      CheckBox other = rootView.findViewById(id);
      if (other == null) {
        break missingId;
      }

      id = R.id.other2;
      CheckBox other2 = rootView.findViewById(id);
      if (other2 == null) {
        break missingId;
      }

      id = R.id.otherText;
      EditText otherText = rootView.findViewById(id);
      if (otherText == null) {
        break missingId;
      }

      id = R.id.otherText2;
      EditText otherText2 = rootView.findViewById(id);
      if (otherText2 == null) {
        break missingId;
      }

      id = R.id.pneumonia;
      CheckBox pneumonia = rootView.findViewById(id);
      if (pneumonia == null) {
        break missingId;
      }

      id = R.id.referral;
      CheckBox referral = rootView.findViewById(id);
      if (referral == null) {
        break missingId;
      }

      id = R.id.severe;
      CheckBox severe = rootView.findViewById(id);
      if (severe == null) {
        break missingId;
      }

      id = R.id.steroids;
      CheckBox steroids = rootView.findViewById(id);
      if (steroids == null) {
        break missingId;
      }

      id = R.id.summary1;
      ScrollView summary1 = rootView.findViewById(id);
      if (summary1 == null) {
        break missingId;
      }

      id = R.id.supportive;
      CheckBox supportive = rootView.findViewById(id);
      if (supportive == null) {
        break missingId;
      }

      id = R.id.wheezing;
      CheckBox wheezing = rootView.findViewById(id);
      if (wheezing == null) {
        break missingId;
      }

      return new ActivityFinalBinding((LinearLayout) rootView, antibiotics, btnExit, cough, inhaled,
          oral, other, other2, otherText, otherText2, pneumonia, referral, severe, steroids,
          summary1, supportive, wheezing);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
