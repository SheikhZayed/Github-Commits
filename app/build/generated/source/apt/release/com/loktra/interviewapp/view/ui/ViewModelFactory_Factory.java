package com.loktra.interviewapp.view.ui;

import com.loktra.interviewapp.di.components.VMSubComponent;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<VMSubComponent> viewModelSubComponentProvider;

  public ViewModelFactory_Factory(Provider<VMSubComponent> viewModelSubComponentProvider) {
    assert viewModelSubComponentProvider != null;
    this.viewModelSubComponentProvider = viewModelSubComponentProvider;
  }

  @Override
  public ViewModelFactory get() {
    return new ViewModelFactory(viewModelSubComponentProvider.get());
  }

  public static Factory<ViewModelFactory> create(
      Provider<VMSubComponent> viewModelSubComponentProvider) {
    return new ViewModelFactory_Factory(viewModelSubComponentProvider);
  }
}
