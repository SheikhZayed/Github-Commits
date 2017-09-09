package com.loktra.interviewapp.di.modules;

import com.loktra.interviewapp.util.DialogUtils;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideDialogUtilsFactory implements Factory<DialogUtils> {
  private final AppModule module;

  public AppModule_ProvideDialogUtilsFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DialogUtils get() {
    return Preconditions.checkNotNull(
        module.provideDialogUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DialogUtils> create(AppModule module) {
    return new AppModule_ProvideDialogUtilsFactory(module);
  }
}
