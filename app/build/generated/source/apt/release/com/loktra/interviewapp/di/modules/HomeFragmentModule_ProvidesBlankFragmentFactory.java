package com.loktra.interviewapp.di.modules;

import com.loktra.interviewapp.view.ui.home.HomeFragment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeFragmentModule_ProvidesBlankFragmentFactory
    implements Factory<HomeFragment> {
  private final HomeFragmentModule module;

  private final Provider<HomeFragment> homeFragmentProvider;

  public HomeFragmentModule_ProvidesBlankFragmentFactory(
      HomeFragmentModule module, Provider<HomeFragment> homeFragmentProvider) {
    assert module != null;
    this.module = module;
    assert homeFragmentProvider != null;
    this.homeFragmentProvider = homeFragmentProvider;
  }

  @Override
  public HomeFragment get() {
    return Preconditions.checkNotNull(
        module.providesBlankFragment(homeFragmentProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HomeFragment> create(
      HomeFragmentModule module, Provider<HomeFragment> homeFragmentProvider) {
    return new HomeFragmentModule_ProvidesBlankFragmentFactory(module, homeFragmentProvider);
  }
}
