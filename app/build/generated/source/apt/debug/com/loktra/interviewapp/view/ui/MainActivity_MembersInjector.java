package com.loktra.interviewapp.view.ui;

import android.support.v4.app.Fragment;
import com.loktra.interviewapp.util.AppUtils;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> mDispatchingAndroidInjectorProvider;

  private final Provider<AppUtils> mAppUtilsProvider;

  public MainActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> mDispatchingAndroidInjectorProvider,
      Provider<AppUtils> mAppUtilsProvider) {
    assert mDispatchingAndroidInjectorProvider != null;
    this.mDispatchingAndroidInjectorProvider = mDispatchingAndroidInjectorProvider;
    assert mAppUtilsProvider != null;
    this.mAppUtilsProvider = mAppUtilsProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<DispatchingAndroidInjector<Fragment>> mDispatchingAndroidInjectorProvider,
      Provider<AppUtils> mAppUtilsProvider) {
    return new MainActivity_MembersInjector(mDispatchingAndroidInjectorProvider, mAppUtilsProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDispatchingAndroidInjector = mDispatchingAndroidInjectorProvider.get();
    instance.mAppUtils = mAppUtilsProvider.get();
  }

  public static void injectMDispatchingAndroidInjector(
      MainActivity instance,
      Provider<DispatchingAndroidInjector<Fragment>> mDispatchingAndroidInjectorProvider) {
    instance.mDispatchingAndroidInjector = mDispatchingAndroidInjectorProvider.get();
  }

  public static void injectMAppUtils(MainActivity instance, Provider<AppUtils> mAppUtilsProvider) {
    instance.mAppUtils = mAppUtilsProvider.get();
  }
}
