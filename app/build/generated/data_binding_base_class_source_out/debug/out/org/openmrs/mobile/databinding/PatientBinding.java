// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class PatientBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView initials;

  @NonNull
  public final TextView patientAge;

  @NonNull
  public final TextView patientParent;

  @NonNull
  public final TextView patientSex;

  @NonNull
  public final LinearLayout pt;

  @NonNull
  public final ImageView ready;

  private PatientBinding(@NonNull CardView rootView, @NonNull TextView date,
      @NonNull TextView initials, @NonNull TextView patientAge, @NonNull TextView patientParent,
      @NonNull TextView patientSex, @NonNull LinearLayout pt, @NonNull ImageView ready) {
    this.rootView = rootView;
    this.date = date;
    this.initials = initials;
    this.patientAge = patientAge;
    this.patientParent = patientParent;
    this.patientSex = patientSex;
    this.pt = pt;
    this.ready = ready;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PatientBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PatientBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.patient, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PatientBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.date;
      TextView date = rootView.findViewById(id);
      if (date == null) {
        break missingId;
      }

      id = R.id.initials;
      TextView initials = rootView.findViewById(id);
      if (initials == null) {
        break missingId;
      }

      id = R.id.patient_age;
      TextView patientAge = rootView.findViewById(id);
      if (patientAge == null) {
        break missingId;
      }

      id = R.id.patient_parent;
      TextView patientParent = rootView.findViewById(id);
      if (patientParent == null) {
        break missingId;
      }

      id = R.id.patient_sex;
      TextView patientSex = rootView.findViewById(id);
      if (patientSex == null) {
        break missingId;
      }

      id = R.id.pt;
      LinearLayout pt = rootView.findViewById(id);
      if (pt == null) {
        break missingId;
      }

      id = R.id.ready;
      ImageView ready = rootView.findViewById(id);
      if (ready == null) {
        break missingId;
      }

      return new PatientBinding((CardView) rootView, date, initials, patientAge, patientParent,
          patientSex, pt, ready);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
