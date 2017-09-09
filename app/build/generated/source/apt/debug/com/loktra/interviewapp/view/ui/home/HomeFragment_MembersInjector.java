package com.loktra.interviewapp.view.ui.home;

import android.arch.lifecycle.ViewModelProvider;
import com.loktra.interviewapp.util.DialogUtils;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<ViewModelProvider.Factory> mViewModelFactoryProvider;

  private final Provider<DialogUtils> mDialogUtilsProvider;

  public HomeFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> mViewModelFactoryProvider,
      Provider<DialogUtils> mDialogUtilsProvider) {
    assert mViewModelFactoryProvider != null;
    this.mViewModelFactoryProvider = mViewModelFactoryProvider;
    assert mDialogUtilsProvider != null;
    this.mDialogUtilsProvider = mDialogUtilsProvider;
  }

  public static MembersInjector<HomeFragment> create(
      Provider<ViewModelProvider.Factory> mViewModelFactoryProvider,
      Provider<DialogUtils> mDialogUtilsProvider) {
    return new HomeFragment_MembersInjector(mViewModelFactoryProvider, mDialogUtilsProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mViewModelFactory = mViewModelFactoryProvider.get();
    instance.mDialogUtils = mDialogUtilsProvider.get();
  }

  public static void injectMViewModelFactory(
      HomeFragment instance, Provider<ViewModelProvider.Factory> mViewModelFactoryProvider) {
    instance.mViewModelFactory = mViewModelFactoryProvider.get();
  }

  public static void injectMDialogUtils(
      HomeFragment instance, Provider<DialogUtils> mDialogUtilsProvider) {
    instance.mDialogUtils = mDialogUtilsProvider.get();
  }
}
