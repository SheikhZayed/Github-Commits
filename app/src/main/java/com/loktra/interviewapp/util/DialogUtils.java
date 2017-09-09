package com.loktra.interviewapp.util;

import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import javax.inject.Inject;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

public class DialogUtils {

  private static ProgressDialog mProgressDialog;
  @Inject
  Application mContext;
  //todo implement context-injection and remove context-param from individual methods

//  public DialogUtils(ProgressDialog mProgressDialog) {
//    this.mProgressDialog = mProgressDialog;
//  }

  public DialogUtils() {
  }

  public void showProgress(Context context,String message) {
    mProgressDialog = new ProgressDialog(context);
    if (!mProgressDialog.isShowing()) {
      mProgressDialog.setMessage(message);
      mProgressDialog.show();
    }
  }

  public void hideProgress() {
    mProgressDialog.cancel();
  }
}
