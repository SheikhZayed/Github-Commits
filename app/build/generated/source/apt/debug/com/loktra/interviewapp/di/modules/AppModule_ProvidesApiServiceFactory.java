package com.loktra.interviewapp.di.modules;

import com.loktra.interviewapp.api.RESTService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvidesApiServiceFactory implements Factory<RESTService> {
  private final AppModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public AppModule_ProvidesApiServiceFactory(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider) {
    assert module != null;
    this.module = module;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public RESTService get() {
    return Preconditions.checkNotNull(
        module.providesApiService(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RESTService> create(
      AppModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new AppModule_ProvidesApiServiceFactory(module, okHttpClientProvider);
  }
}
