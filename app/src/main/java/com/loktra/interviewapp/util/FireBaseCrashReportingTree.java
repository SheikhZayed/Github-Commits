package com.loktra.interviewapp.util;

import android.util.Log;

import timber.log.Timber;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

public class FireBaseCrashReportingTree extends Timber.Tree {

  @Override
  protected void log(int priority, String tag, String message, Throwable t) {
    if (priority == Log.VERBOSE || priority == Log.DEBUG) {
      return;
    }
//    FirebaseCrash.log(message);
    if (t != null) {
//      FirebaseCrash.report(t);
    }
  }
}
