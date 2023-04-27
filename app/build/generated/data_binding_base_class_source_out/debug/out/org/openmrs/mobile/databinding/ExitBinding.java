// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class ExitBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView head;

  @NonNull
  public final Button no;

  @NonNull
  public final TextView text;

  @NonNull
  public final Button yes;

  private ExitBinding(@NonNull LinearLayout rootView, @NonNull TextView head, @NonNull Button no,
      @NonNull TextView text, @NonNull Button yes) {
    this.rootView = rootView;
    this.head = head;
    this.no = no;
    this.text = text;
    this.yes = yes;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExitBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.exit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExitBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.head;
      TextView head = rootView.findViewById(id);
      if (head == null) {
        break missingId;
      }

      id = R.id.no;
      Button no = rootView.findViewById(id);
      if (no == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = rootView.findViewById(id);
      if (text == null) {
        break missingId;
      }

      id = R.id.yes;
      Button yes = rootView.findViewById(id);
      if (yes == null) {
        break missingId;
      }

      return new ExitBinding((LinearLayout) rootView, head, no, text, yes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
