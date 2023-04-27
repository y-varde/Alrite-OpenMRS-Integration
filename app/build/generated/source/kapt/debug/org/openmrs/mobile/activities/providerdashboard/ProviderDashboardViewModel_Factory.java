// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.activities.providerdashboard;

import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.ProviderRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProviderDashboardViewModel_Factory implements Factory<ProviderDashboardViewModel> {
  private final Provider<ProviderRepository> providerRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public ProviderDashboardViewModel_Factory(Provider<ProviderRepository> providerRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.providerRepositoryProvider = providerRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public ProviderDashboardViewModel get() {
    return newInstance(providerRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static ProviderDashboardViewModel_Factory create(
      Provider<ProviderRepository> providerRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new ProviderDashboardViewModel_Factory(providerRepositoryProvider, savedStateHandleProvider);
  }

  public static ProviderDashboardViewModel newInstance(ProviderRepository providerRepository,
      SavedStateHandle savedStateHandle) {
    return new ProviderDashboardViewModel(providerRepository, savedStateHandle);
  }
}
