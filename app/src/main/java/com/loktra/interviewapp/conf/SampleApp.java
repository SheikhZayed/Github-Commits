package com.loktra.interviewapp.conf;

import android.app.Activity;
import android.app.Application;
import com.loktra.interviewapp.BuildConfig;
import com.loktra.interviewapp.di.components.AppInjector;
import com.loktra.interviewapp.util.FireBaseCrashReportingTree;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import javax.inject.Inject;
import timber.log.Timber;
import timber.log.Timber.DebugTree;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

public class SampleApp extends Application implements HasActivityInjector {

  @Inject DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;
  @Override public AndroidInjector<Activity> activityInjector() {
    return dispatchingAndroidInjector;
  }

  @Override public void onCreate() {
    super.onCreate();

    AppInjector.init(this);
    if (BuildConfig.DEBUG) {
      Timber.plant(new DebugTree());
    } else {
      Timber.plant(new FireBaseCrashReportingTree());
    }
  }
}
