package com.loktra.interviewapp.di.modules;

import android.arch.lifecycle.ViewModelProvider;
import com.loktra.interviewapp.di.components.VMSubComponent;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideViewModelFactoryFactory
    implements Factory<ViewModelProvider.Factory> {
  private final AppModule module;

  private final Provider<VMSubComponent.Builder> viewModelSubComponentProvider;

  public AppModule_ProvideViewModelFactoryFactory(
      AppModule module, Provider<VMSubComponent.Builder> viewModelSubComponentProvider) {
    assert module != null;
    this.module = module;
    assert viewModelSubComponentProvider != null;
    this.viewModelSubComponentProvider = viewModelSubComponentProvider;
  }

  @Override
  public ViewModelProvider.Factory get() {
    return Preconditions.checkNotNull(
        module.provideViewModelFactory(viewModelSubComponentProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ViewModelProvider.Factory> create(
      AppModule module, Provider<VMSubComponent.Builder> viewModelSubComponentProvider) {
    return new AppModule_ProvideViewModelFactoryFactory(module, viewModelSubComponentProvider);
  }

  /** Proxies {@link AppModule#provideViewModelFactory(VMSubComponent.Builder)}. */
  public static ViewModelProvider.Factory proxyProvideViewModelFactory(
      AppModule instance, VMSubComponent.Builder viewModelSubComponent) {
    return instance.provideViewModelFactory(viewModelSubComponent);
  }
}
