// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class FragmentSyncedPatientsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView emptySyncedPatientList;

  @NonNull
  public final SwipeRefreshLayout swipeLayout;

  @NonNull
  public final RecyclerView syncedPatientRecyclerView;

  @NonNull
  public final ProgressBar syncedPatientsInitialProgressBar;

  private FragmentSyncedPatientsBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView emptySyncedPatientList, @NonNull SwipeRefreshLayout swipeLayout,
      @NonNull RecyclerView syncedPatientRecyclerView,
      @NonNull ProgressBar syncedPatientsInitialProgressBar) {
    this.rootView = rootView;
    this.emptySyncedPatientList = emptySyncedPatientList;
    this.swipeLayout = swipeLayout;
    this.syncedPatientRecyclerView = syncedPatientRecyclerView;
    this.syncedPatientsInitialProgressBar = syncedPatientsInitialProgressBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSyncedPatientsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSyncedPatientsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_synced_patients, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSyncedPatientsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emptySyncedPatientList;
      TextView emptySyncedPatientList = rootView.findViewById(id);
      if (emptySyncedPatientList == null) {
        break missingId;
      }

      id = R.id.swipeLayout;
      SwipeRefreshLayout swipeLayout = rootView.findViewById(id);
      if (swipeLayout == null) {
        break missingId;
      }

      id = R.id.syncedPatientRecyclerView;
      RecyclerView syncedPatientRecyclerView = rootView.findViewById(id);
      if (syncedPatientRecyclerView == null) {
        break missingId;
      }

      id = R.id.syncedPatientsInitialProgressBar;
      ProgressBar syncedPatientsInitialProgressBar = rootView.findViewById(id);
      if (syncedPatientsInitialProgressBar == null) {
        break missingId;
      }

      return new FragmentSyncedPatientsBinding((RelativeLayout) rootView, emptySyncedPatientList,
          swipeLayout, syncedPatientRecyclerView, syncedPatientsInitialProgressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
