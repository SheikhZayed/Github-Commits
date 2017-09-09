package com.loktra.interviewapp.di.modules;

import android.app.Application;
import com.squareup.picasso.Picasso;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvidesPicassoFactory implements Factory<Picasso> {
  private final AppModule module;

  private final Provider<Application> applicationProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public AppModule_ProvidesPicassoFactory(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    assert module != null;
    this.module = module;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Picasso get() {
    return Preconditions.checkNotNull(
        module.providesPicasso(applicationProvider.get(), okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Picasso> create(
      AppModule module,
      Provider<Application> applicationProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new AppModule_ProvidesPicassoFactory(module, applicationProvider, okHttpClientProvider);
  }
}
