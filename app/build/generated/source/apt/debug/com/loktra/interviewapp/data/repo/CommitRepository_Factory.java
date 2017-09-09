package com.loktra.interviewapp.data.repo;

import com.loktra.interviewapp.api.RESTService;
import com.loktra.interviewapp.conf.AppExecutors;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CommitRepository_Factory implements Factory<CommitRepository> {
  private final Provider<RESTService> mApiServiceProvider;

  private final Provider<AppExecutors> mAppExecutorsProvider;

  public CommitRepository_Factory(
      Provider<RESTService> mApiServiceProvider, Provider<AppExecutors> mAppExecutorsProvider) {
    assert mApiServiceProvider != null;
    this.mApiServiceProvider = mApiServiceProvider;
    assert mAppExecutorsProvider != null;
    this.mAppExecutorsProvider = mAppExecutorsProvider;
  }

  @Override
  public CommitRepository get() {
    return new CommitRepository(mApiServiceProvider.get(), mAppExecutorsProvider.get());
  }

  public static Factory<CommitRepository> create(
      Provider<RESTService> mApiServiceProvider, Provider<AppExecutors> mAppExecutorsProvider) {
    return new CommitRepository_Factory(mApiServiceProvider, mAppExecutorsProvider);
  }
}
