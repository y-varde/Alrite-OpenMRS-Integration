// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class FragmentWheezingBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button back;

  @NonNull
  public final RelativeLayout buttons;

  @NonNull
  public final Button next;

  @NonNull
  public final RadioButton noisyBreathing;

  @NonNull
  public final RadioButton normal;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final CheckBox stethoscope;

  @NonNull
  public final Button wheez;

  @NonNull
  public final RadioButton wheezing;

  private FragmentWheezingBinding(@NonNull LinearLayout rootView, @NonNull Button back,
      @NonNull RelativeLayout buttons, @NonNull Button next, @NonNull RadioButton noisyBreathing,
      @NonNull RadioButton normal, @NonNull RadioGroup radioGroup, @NonNull CheckBox stethoscope,
      @NonNull Button wheez, @NonNull RadioButton wheezing) {
    this.rootView = rootView;
    this.back = back;
    this.buttons = buttons;
    this.next = next;
    this.noisyBreathing = noisyBreathing;
    this.normal = normal;
    this.radioGroup = radioGroup;
    this.stethoscope = stethoscope;
    this.wheez = wheez;
    this.wheezing = wheezing;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWheezingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWheezingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_wheezing, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWheezingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      Button back = rootView.findViewById(id);
      if (back == null) {
        break missingId;
      }

      id = R.id.buttons;
      RelativeLayout buttons = rootView.findViewById(id);
      if (buttons == null) {
        break missingId;
      }

      id = R.id.next;
      Button next = rootView.findViewById(id);
      if (next == null) {
        break missingId;
      }

      id = R.id.noisy_breathing;
      RadioButton noisyBreathing = rootView.findViewById(id);
      if (noisyBreathing == null) {
        break missingId;
      }

      id = R.id.normal;
      RadioButton normal = rootView.findViewById(id);
      if (normal == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = rootView.findViewById(id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.stethoscope;
      CheckBox stethoscope = rootView.findViewById(id);
      if (stethoscope == null) {
        break missingId;
      }

      id = R.id.wheez;
      Button wheez = rootView.findViewById(id);
      if (wheez == null) {
        break missingId;
      }

      id = R.id.wheezing;
      RadioButton wheezing = rootView.findViewById(id);
      if (wheezing == null) {
        break missingId;
      }

      return new FragmentWheezingBinding((LinearLayout) rootView, back, buttons, next,
          noisyBreathing, normal, radioGroup, stethoscope, wheez, wheezing);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
