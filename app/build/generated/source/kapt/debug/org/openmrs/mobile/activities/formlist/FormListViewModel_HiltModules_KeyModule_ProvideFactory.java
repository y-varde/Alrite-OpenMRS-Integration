// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.activities.formlist;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FormListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static FormListViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(FormListViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final FormListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new FormListViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
