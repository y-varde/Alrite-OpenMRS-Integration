// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class Fragment7v3Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button back;

  @NonNull
  public final RelativeLayout buttons;

  @NonNull
  public final Button next;

  @NonNull
  public final RadioButton no;

  @NonNull
  public final RadioButton notSure;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final RadioButton yes;

  private Fragment7v3Binding(@NonNull LinearLayout rootView, @NonNull Button back,
      @NonNull RelativeLayout buttons, @NonNull Button next, @NonNull RadioButton no,
      @NonNull RadioButton notSure, @NonNull RadioGroup radioGroup, @NonNull RadioButton yes) {
    this.rootView = rootView;
    this.back = back;
    this.buttons = buttons;
    this.next = next;
    this.no = no;
    this.notSure = notSure;
    this.radioGroup = radioGroup;
    this.yes = yes;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Fragment7v3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Fragment7v3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_7v3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Fragment7v3Binding bind(@NonNull View rootView) {
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

      id = R.id.no;
      RadioButton no = rootView.findViewById(id);
      if (no == null) {
        break missingId;
      }

      id = R.id.not_sure;
      RadioButton notSure = rootView.findViewById(id);
      if (notSure == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = rootView.findViewById(id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.yes;
      RadioButton yes = rootView.findViewById(id);
      if (yes == null) {
        break missingId;
      }

      return new Fragment7v3Binding((LinearLayout) rootView, back, buttons, next, no, notSure,
          radioGroup, yes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
