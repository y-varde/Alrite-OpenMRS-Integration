// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.activities.dashboard;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DashboardViewModel_Factory implements Factory<DashboardViewModel> {
  @Override
  public DashboardViewModel get() {
    return newInstance();
  }

  public static DashboardViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DashboardViewModel newInstance() {
    return new DashboardViewModel();
  }

  private static final class InstanceHolder {
    private static final DashboardViewModel_Factory INSTANCE = new DashboardViewModel_Factory();
  }
}
