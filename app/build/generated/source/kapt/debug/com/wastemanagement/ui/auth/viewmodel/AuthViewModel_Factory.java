// Generated by Dagger (https://dagger.dev).
package com.wastemanagement.ui.auth.viewmodel;

import com.wastemanagement.data.repository.AuthRepository;
import com.wastemanagement.network.NetworkHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<AuthRepository> repositoryProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public AuthViewModel_Factory(Provider<AuthRepository> repositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.repositoryProvider = repositoryProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(repositoryProvider.get(), networkHelperProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<AuthRepository> repositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new AuthViewModel_Factory(repositoryProvider, networkHelperProvider);
  }

  public static AuthViewModel newInstance(AuthRepository repository, NetworkHelper networkHelper) {
    return new AuthViewModel(repository, networkHelper);
  }
}
