// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.services;

import com.openmrs.android_sdk.library.api.RestApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserService_Factory implements Factory<UserService> {
  private final Provider<RestApi> restApiProvider;

  public UserService_Factory(Provider<RestApi> restApiProvider) {
    this.restApiProvider = restApiProvider;
  }

  @Override
  public UserService get() {
    return newInstance(restApiProvider.get());
  }

  public static UserService_Factory create(Provider<RestApi> restApiProvider) {
    return new UserService_Factory(restApiProvider);
  }

  public static UserService newInstance(RestApi restApi) {
    return new UserService(restApi);
  }
}
