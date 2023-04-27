// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.services;

import com.openmrs.android_sdk.library.api.repository.EncounterRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EncounterService_MembersInjector implements MembersInjector<EncounterService> {
  private final Provider<EncounterRepository> encounterRepositoryProvider;

  public EncounterService_MembersInjector(
      Provider<EncounterRepository> encounterRepositoryProvider) {
    this.encounterRepositoryProvider = encounterRepositoryProvider;
  }

  public static MembersInjector<EncounterService> create(
      Provider<EncounterRepository> encounterRepositoryProvider) {
    return new EncounterService_MembersInjector(encounterRepositoryProvider);
  }

  @Override
  public void injectMembers(EncounterService instance) {
    injectEncounterRepository(instance, encounterRepositoryProvider.get());
  }

  @InjectedFieldSignature("org.openmrs.mobile.services.EncounterService.encounterRepository")
  public static void injectEncounterRepository(EncounterService instance,
      EncounterRepository encounterRepository) {
    instance.encounterRepository = encounterRepository;
  }
}
