package com.loktra.interviewapp.di.modules;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvidesContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  public AppModule_ProvidesContextFactory(
      AppModule module, Provider<Application> applicationProvider) {
    assert module != null;
    this.module = module;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.providesContext(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(
      AppModule module, Provider<Application> applicationProvider) {
    return new AppModule_ProvidesContextFactory(module, applicationProvider);
  }

  /** Proxies {@link AppModule#providesContext(Application)}. */
  public static Context proxyProvidesContext(AppModule instance, Application application) {
    return instance.providesContext(application);
  }
}
