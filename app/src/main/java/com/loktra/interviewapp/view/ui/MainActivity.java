package com.loktra.interviewapp.view.ui;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.loktra.interviewapp.R;
import com.loktra.interviewapp.databinding.ActivityMainBinding;
import com.loktra.interviewapp.util.AppUtils;
import com.loktra.interviewapp.view.ui.home.HomeFragment;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {

  @Inject DispatchingAndroidInjector<Fragment> mDispatchingAndroidInjector;
  private ActivityMainBinding mBinding;
  @Inject AppUtils mAppUtils;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    showHomeAsDefault();

    if (!mAppUtils.isNetworkAvailable(this)){
       new AlertDialog.Builder(this).setMessage("Please turn on Internet")
          .setPositiveButton("Open Settings", (dialogInterface, i) -> {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings$DataUsageSummaryActivity"));
            startActivity(intent);
          }).create().show();

    }
  }

  private void showHomeAsDefault() {
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.parent, HomeFragment.newInstance());
    transaction.commit();
  }

  @Override public AndroidInjector<Fragment> supportFragmentInjector() {
    return mDispatchingAndroidInjector;
  }

}
