package com.loktra.interviewapp.di.modules;

import com.loktra.interviewapp.util.AppUtils;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvidesAppUtilsFactory implements Factory<AppUtils> {
  private final AppModule module;

  public AppModule_ProvidesAppUtilsFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AppUtils get() {
    return Preconditions.checkNotNull(
        module.providesAppUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AppUtils> create(AppModule module) {
    return new AppModule_ProvidesAppUtilsFactory(module);
  }
}
