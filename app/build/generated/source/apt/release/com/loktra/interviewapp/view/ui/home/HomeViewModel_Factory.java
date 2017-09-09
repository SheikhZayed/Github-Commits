package com.loktra.interviewapp.view.ui.home;

import android.app.Application;
import com.loktra.interviewapp.data.repo.CommitRepository;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final MembersInjector<HomeViewModel> homeViewModelMembersInjector;

  private final Provider<Application> applicationProvider;

  private final Provider<CommitRepository> contentRepositoryProvider;

  public HomeViewModel_Factory(
      MembersInjector<HomeViewModel> homeViewModelMembersInjector,
      Provider<Application> applicationProvider,
      Provider<CommitRepository> contentRepositoryProvider) {
    assert homeViewModelMembersInjector != null;
    this.homeViewModelMembersInjector = homeViewModelMembersInjector;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
    assert contentRepositoryProvider != null;
    this.contentRepositoryProvider = contentRepositoryProvider;
  }

  @Override
  public HomeViewModel get() {
    return MembersInjectors.injectMembers(
        homeViewModelMembersInjector,
        new HomeViewModel(applicationProvider.get(), contentRepositoryProvider.get()));
  }

  public static Factory<HomeViewModel> create(
      MembersInjector<HomeViewModel> homeViewModelMembersInjector,
      Provider<Application> applicationProvider,
      Provider<CommitRepository> contentRepositoryProvider) {
    return new HomeViewModel_Factory(
        homeViewModelMembersInjector, applicationProvider, contentRepositoryProvider);
  }
}
