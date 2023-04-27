// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class ActivityProviderDashboardBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CustomExpandableFabBinding actionsFab;

  @NonNull
  public final AppBarLayout providerDashboardAppbar;

  @NonNull
  public final FrameLayout providerDashboardContentFrame;

  @NonNull
  public final ViewPager providerDashboardPager;

  @NonNull
  public final CoordinatorLayout providerDashboardRootLayout;

  @NonNull
  public final TabLayout providerDashboardTablayout;

  private ActivityProviderDashboardBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CustomExpandableFabBinding actionsFab, @NonNull AppBarLayout providerDashboardAppbar,
      @NonNull FrameLayout providerDashboardContentFrame, @NonNull ViewPager providerDashboardPager,
      @NonNull CoordinatorLayout providerDashboardRootLayout,
      @NonNull TabLayout providerDashboardTablayout) {
    this.rootView = rootView;
    this.actionsFab = actionsFab;
    this.providerDashboardAppbar = providerDashboardAppbar;
    this.providerDashboardContentFrame = providerDashboardContentFrame;
    this.providerDashboardPager = providerDashboardPager;
    this.providerDashboardRootLayout = providerDashboardRootLayout;
    this.providerDashboardTablayout = providerDashboardTablayout;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProviderDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProviderDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_provider_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProviderDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actionsFab;
      View actionsFab = rootView.findViewById(id);
      if (actionsFab == null) {
        break missingId;
      }
      CustomExpandableFabBinding binding_actionsFab = CustomExpandableFabBinding.bind(actionsFab);

      id = R.id.provider_dashboard_appbar;
      AppBarLayout providerDashboardAppbar = rootView.findViewById(id);
      if (providerDashboardAppbar == null) {
        break missingId;
      }

      id = R.id.provider_dashboard_content_frame;
      FrameLayout providerDashboardContentFrame = rootView.findViewById(id);
      if (providerDashboardContentFrame == null) {
        break missingId;
      }

      id = R.id.provider_dashboard_pager;
      ViewPager providerDashboardPager = rootView.findViewById(id);
      if (providerDashboardPager == null) {
        break missingId;
      }

      CoordinatorLayout providerDashboardRootLayout = (CoordinatorLayout) rootView;

      id = R.id.provider_dashboard_tablayout;
      TabLayout providerDashboardTablayout = rootView.findViewById(id);
      if (providerDashboardTablayout == null) {
        break missingId;
      }

      return new ActivityProviderDashboardBinding((CoordinatorLayout) rootView, binding_actionsFab,
          providerDashboardAppbar, providerDashboardContentFrame, providerDashboardPager,
          providerDashboardRootLayout, providerDashboardTablayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
