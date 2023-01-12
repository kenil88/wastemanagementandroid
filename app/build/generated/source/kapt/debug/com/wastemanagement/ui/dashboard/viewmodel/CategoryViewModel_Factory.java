// Generated by Dagger (https://dagger.dev).
package com.wastemanagement.ui.dashboard.viewmodel;

import com.wastemanagement.data.repository.FunctionalRepository;
import com.wastemanagement.network.NetworkHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CategoryViewModel_Factory implements Factory<CategoryViewModel> {
  private final Provider<FunctionalRepository> repositoryProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public CategoryViewModel_Factory(Provider<FunctionalRepository> repositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.repositoryProvider = repositoryProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public CategoryViewModel get() {
    return newInstance(repositoryProvider.get(), networkHelperProvider.get());
  }

  public static CategoryViewModel_Factory create(Provider<FunctionalRepository> repositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new CategoryViewModel_Factory(repositoryProvider, networkHelperProvider);
  }

  public static CategoryViewModel newInstance(FunctionalRepository repository,
      NetworkHelper networkHelper) {
    return new CategoryViewModel(repository, networkHelper);
  }
}
