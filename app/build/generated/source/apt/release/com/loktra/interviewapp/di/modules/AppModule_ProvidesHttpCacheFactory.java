package com.loktra.interviewapp.di.modules;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvidesHttpCacheFactory implements Factory<Cache> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvidesHttpCacheFactory(
      AppModule module, Provider<Application> applicationProvider) {
    assert module != null;
    this.module = module;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Cache get() {
    return Preconditions.checkNotNull(
        module.providesHttpCache(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Cache> create(AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_ProvidesHttpCacheFactory(module, applicationProvider);
  }
}
