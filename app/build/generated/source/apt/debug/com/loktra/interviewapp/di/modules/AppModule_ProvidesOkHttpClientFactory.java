package com.loktra.interviewapp.di.modules;

import com.loktra.interviewapp.api.LoggingInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  private final Provider<LoggingInterceptor> requestInterceptorProvider;

  private final Provider<Cache> cacheProvider;

  public AppModule_ProvidesOkHttpClientFactory(
      AppModule module,
      Provider<LoggingInterceptor> requestInterceptorProvider,
      Provider<Cache> cacheProvider) {
    assert module != null;
    this.module = module;
    assert requestInterceptorProvider != null;
    this.requestInterceptorProvider = requestInterceptorProvider;
    assert cacheProvider != null;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.providesOkHttpClient(requestInterceptorProvider.get(), cacheProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(
      AppModule module,
      Provider<LoggingInterceptor> requestInterceptorProvider,
      Provider<Cache> cacheProvider) {
    return new AppModule_ProvidesOkHttpClientFactory(
        module, requestInterceptorProvider, cacheProvider);
  }
}
