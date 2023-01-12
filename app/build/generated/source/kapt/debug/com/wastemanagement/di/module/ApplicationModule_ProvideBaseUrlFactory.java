// Generated by Dagger (https://dagger.dev).
package com.wastemanagement.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideBaseUrlFactory implements Factory<String> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideBaseUrlFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideBaseUrl(module);
  }

  public static ApplicationModule_ProvideBaseUrlFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideBaseUrlFactory(module);
  }

  public static String provideBaseUrl(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBaseUrl());
  }
}
