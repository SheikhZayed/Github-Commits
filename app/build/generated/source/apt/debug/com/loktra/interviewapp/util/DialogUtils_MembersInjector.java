package com.loktra.interviewapp.util;

import android.app.Application;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DialogUtils_MembersInjector implements MembersInjector<DialogUtils> {
  private final Provider<Application> mContextProvider;

  public DialogUtils_MembersInjector(Provider<Application> mContextProvider) {
    assert mContextProvider != null;
    this.mContextProvider = mContextProvider;
  }

  public static MembersInjector<DialogUtils> create(Provider<Application> mContextProvider) {
    return new DialogUtils_MembersInjector(mContextProvider);
  }

  @Override
  public void injectMembers(DialogUtils instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mContext = mContextProvider.get();
  }

  public static void injectMContext(DialogUtils instance, Provider<Application> mContextProvider) {
    instance.mContext = mContextProvider.get();
  }
}
