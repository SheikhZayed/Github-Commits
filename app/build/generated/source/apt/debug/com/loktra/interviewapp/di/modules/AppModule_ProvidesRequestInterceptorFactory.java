package com.loktra.interviewapp.di.modules;

import com.loktra.interviewapp.api.LoggingInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvidesRequestInterceptorFactory
    implements Factory<LoggingInterceptor> {
  private final AppModule module;

  public AppModule_ProvidesRequestInterceptorFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoggingInterceptor get() {
    return Preconditions.checkNotNull(
        module.providesRequestInterceptor(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoggingInterceptor> create(AppModule module) {
    return new AppModule_ProvidesRequestInterceptorFactory(module);
  }
}
