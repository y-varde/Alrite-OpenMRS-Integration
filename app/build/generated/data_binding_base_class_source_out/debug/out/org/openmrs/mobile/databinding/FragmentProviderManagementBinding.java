// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class FragmentProviderManagementBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final TextView emptyProviderManagementList;

  @NonNull
  public final FloatingActionButton providerManagementFragAddFAB;

  @NonNull
  public final ProgressBar providerManagementInitialProgressBar;

  @NonNull
  public final RecyclerView providerManagementRecyclerView;

  @NonNull
  public final SwipeRefreshLayout swipeLayout;

  private FragmentProviderManagementBinding(@NonNull CoordinatorLayout rootView,
      @NonNull TextView emptyProviderManagementList,
      @NonNull FloatingActionButton providerManagementFragAddFAB,
      @NonNull ProgressBar providerManagementInitialProgressBar,
      @NonNull RecyclerView providerManagementRecyclerView,
      @NonNull SwipeRefreshLayout swipeLayout) {
    this.rootView = rootView;
    this.emptyProviderManagementList = emptyProviderManagementList;
    this.providerManagementFragAddFAB = providerManagementFragAddFAB;
    this.providerManagementInitialProgressBar = providerManagementInitialProgressBar;
    this.providerManagementRecyclerView = providerManagementRecyclerView;
    this.swipeLayout = swipeLayout;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProviderManagementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProviderManagementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_provider_management, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProviderManagementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emptyProviderManagementList;
      TextView emptyProviderManagementList = rootView.findViewById(id);
      if (emptyProviderManagementList == null) {
        break missingId;
      }

      id = R.id.providerManagementFragAddFAB;
      FloatingActionButton providerManagementFragAddFAB = rootView.findViewById(id);
      if (providerManagementFragAddFAB == null) {
        break missingId;
      }

      id = R.id.providerManagementInitialProgressBar;
      ProgressBar providerManagementInitialProgressBar = rootView.findViewById(id);
      if (providerManagementInitialProgressBar == null) {
        break missingId;
      }

      id = R.id.providerManagementRecyclerView;
      RecyclerView providerManagementRecyclerView = rootView.findViewById(id);
      if (providerManagementRecyclerView == null) {
        break missingId;
      }

      id = R.id.swipeLayout;
      SwipeRefreshLayout swipeLayout = rootView.findViewById(id);
      if (swipeLayout == null) {
        break missingId;
      }

      return new FragmentProviderManagementBinding((CoordinatorLayout) rootView,
          emptyProviderManagementList, providerManagementFragAddFAB,
          providerManagementInitialProgressBar, providerManagementRecyclerView, swipeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
