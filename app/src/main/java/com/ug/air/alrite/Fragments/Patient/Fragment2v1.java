package com.ug.air.alrite.Fragments.Patient;

import static com.ug.air.alrite.Fragments.Patient.Fragment4.DATE;
import static com.ug.air.alrite.Fragments.Patient.Fragment2.MIDDLENAME;
import static com.ug.air.alrite.Fragments.Patient.Fragment2.OTHERNAME;
import static com.ug.air.alrite.Fragments.Patient.Fragment2.PHONE;
import static com.ug.air.alrite.Fragments.Patient.Fragment2.SURNAME;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.ug.air.alrite.Adapters.AssessmentAdapter;
import com.ug.air.alrite.Adapters.PatientAdapter;
import com.ug.air.alrite.BuildConfig;
import com.ug.air.alrite.Models.Item;
import com.ug.air.alrite.Models.Patient;
import com.ug.air.alrite.R;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;


public class Fragment2v1 extends Fragment {

    View view;
    RecyclerView recyclerView;
    EditText etSearch;
    ImageView back;
    ArrayList<Item> items;
    PatientAdapter patientAdapter;
    String sName, oName, mName, phone, search;
    ArrayList<String> types, files, file;
    SharedPreferences sharedPreferences;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_2v1, container, false);

        recyclerView = view.findViewById(R.id.recyclerView3);
        etSearch = view.findViewById(R.id.search);
        back = view.findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr = Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, new Fragment1());
                fr.commit();
            }
        });

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        items = new ArrayList<>();
        files = new ArrayList<String>();

        accessSharedFile();

        etSearch.addTextChangedListener(textWatcher);

        patientAdapter = new PatientAdapter(getActivity(), items);
        recyclerView.setAdapter(patientAdapter);

        patientAdapter.setOnItemClickListener(new PatientAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Patient patient = (Patient) items.get(position).getObject();
                String name = patient.getFileName();
                Bundle bundle = new Bundle();
                bundle.putString("fileName", name);
                Fragment2v2 fragment2v2 = new Fragment2v2();
                fragment2v2.setArguments(bundle);
                FragmentTransaction fr = Objects.requireNonNull(getActivity()).getSupportFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container, fragment2v2);
                fr.addToBackStack(null);
                fr.commit();
            }
        });


        return view;
    }


    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            search = etSearch.getText().toString();
            if (!search.isEmpty()) {
                items.clear();
                for(String type : types){
                    String [] split = type.split("\\s+");
                    if (split[0].toLowerCase().startsWith(search) || split[1].toLowerCase().startsWith(search)){
                        int index = types.indexOf(type);
                        String fileName = file.get(index);
                        sharedPreferences = Objects.requireNonNull(getActivity()).getSharedPreferences(fileName, Context.MODE_PRIVATE);
                        sName = sharedPreferences.getString(SURNAME, "");
                        oName = sharedPreferences.getString(OTHERNAME, "");
                        mName = sharedPreferences.getString(MIDDLENAME, "");
                        phone = sharedPreferences.getString(DATE, "");
                        String namesy = sName + " " + oName + " " + mName;
                        char inti1 = sName.charAt(0);
                        char inti2 = oName.charAt(0);
                        String inti = inti1 + "" + inti2;

                        try {
                            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                            Date date = df.parse(phone);
                            SimpleDateFormat df1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm");
                            String formattedDate = df1.format(date);
                            Patient patient = new Patient(namesy, formattedDate, inti, fileName + ".xml");
                            items.add(new Item(0, patient));
                            patientAdapter.notifyDataSetChanged();
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }else {
                items.clear();
                accessSharedFile();
                patientAdapter.notifyDataSetChanged();
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private void accessSharedFile() {
        File src = new File("/data/data/" + BuildConfig.APPLICATION_ID + "/shared_prefs");
        if (src.exists()){
            File[] contents = src.listFiles();
//        Toast.makeText(getActivity(), "" + contents, Toast.LENGTH_SHORT).show();
            if (contents.length != 0) {
                for (File f : contents) {
                    if (f.isFile()) {
                        String name = f.getName().toString();
                        files.add(name);
                    }
                }
                Collections.reverse(files);
                types = new ArrayList<String>();
                file = new ArrayList<String>();
                for(String name : files){
                    if (!name.equals("sharedPrefs.xml")){
                        String names = name.replace(".xml", "");
                        sharedPreferences = Objects.requireNonNull(getActivity()).getSharedPreferences(names, Context.MODE_PRIVATE);
                        sName = sharedPreferences.getString(SURNAME, "");
                        oName = sharedPreferences.getString(OTHERNAME, "");
                        mName = sharedPreferences.getString(MIDDLENAME, "");
                        phone = sharedPreferences.getString(DATE, "");
                        String namesy = sName + " " + oName + " " + mName;
                        if (!types.contains(namesy)){
                            types.add(namesy);
                            file.add(names);
                            char inti1 = sName.charAt(0);
                            char inti2 = oName.charAt(0);
                            String inti = inti1 + "" + inti2;

                            try {
                                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                                Date date = df.parse(phone);
                                SimpleDateFormat df1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm");
                                String formattedDate = df1.format(date);
                                Patient patient = new Patient(namesy, formattedDate, inti, name);
                                items.add(new Item(0, patient));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }

            }else{
//            Toast.makeText(this, "empty", Toast.LENGTH_SHORT).show();
            }
        }
    }
}