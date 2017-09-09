package com.loktra.interviewapp.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import javax.inject.Inject;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

public class AppUtils {

  public boolean isNetworkAvailable(Context context) {
    ConnectivityManager connectivityManager
        = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo activeNetworkInfo = null;
    if (connectivityManager != null) {
      activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    }
    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
  }
}
