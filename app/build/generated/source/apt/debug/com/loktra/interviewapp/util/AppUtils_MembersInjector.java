package com.loktra.interviewapp.util;

import android.content.Context;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppUtils_MembersInjector implements MembersInjector<AppUtils> {
  private final Provider<Context> mContextProvider;

  public AppUtils_MembersInjector(Provider<Context> mContextProvider) {
    assert mContextProvider != null;
    this.mContextProvider = mContextProvider;
  }

  public static MembersInjector<AppUtils> create(Provider<Context> mContextProvider) {
    return new AppUtils_MembersInjector(mContextProvider);
  }

  @Override
  public void injectMembers(AppUtils instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mContext = mContextProvider.get();
  }

  public static void injectMContext(AppUtils instance, Provider<Context> mContextProvider) {
    instance.mContext = mContextProvider.get();
  }
}
