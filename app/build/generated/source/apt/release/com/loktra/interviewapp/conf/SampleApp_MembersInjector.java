package com.loktra.interviewapp.conf;

import android.app.Activity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SampleApp_MembersInjector implements MembersInjector<SampleApp> {
  private final Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  public SampleApp_MembersInjector(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    assert dispatchingAndroidInjectorProvider != null;
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<SampleApp> create(
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    return new SampleApp_MembersInjector(dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(SampleApp instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.dispatchingAndroidInjector = dispatchingAndroidInjectorProvider.get();
  }

  public static void injectDispatchingAndroidInjector(
      SampleApp instance,
      Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider) {
    instance.dispatchingAndroidInjector = dispatchingAndroidInjectorProvider.get();
  }
}
