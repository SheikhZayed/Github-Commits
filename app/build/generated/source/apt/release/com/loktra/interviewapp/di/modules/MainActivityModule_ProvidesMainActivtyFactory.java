package com.loktra.interviewapp.di.modules;

import com.loktra.interviewapp.view.ui.MainActivity;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivityModule_ProvidesMainActivtyFactory implements Factory<MainActivity> {
  private final MainActivityModule module;

  private final Provider<MainActivity> mainActivityProvider;

  public MainActivityModule_ProvidesMainActivtyFactory(
      MainActivityModule module, Provider<MainActivity> mainActivityProvider) {
    assert module != null;
    this.module = module;
    assert mainActivityProvider != null;
    this.mainActivityProvider = mainActivityProvider;
  }

  @Override
  public MainActivity get() {
    return Preconditions.checkNotNull(
        module.providesMainActivty(mainActivityProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MainActivity> create(
      MainActivityModule module, Provider<MainActivity> mainActivityProvider) {
    return new MainActivityModule_ProvidesMainActivtyFactory(module, mainActivityProvider);
  }
}
