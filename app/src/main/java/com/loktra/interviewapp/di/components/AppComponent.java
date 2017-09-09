package com.loktra.interviewapp.di.components;

import android.app.Application;
import android.content.Context;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import javax.inject.Singleton;
import com.loktra.interviewapp.conf.SampleApp;
import com.loktra.interviewapp.di.builder.ActivityBuilder;
import com.loktra.interviewapp.di.modules.AppModule;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */


/**
 * AppComponent --> ActivityBuilder(in which all the activities of the app gets listed)
 * --> FragmentsBuilder via Modules.
 * <p>
 * Basically Appcomponent talks to Activity Builder which then talks to FragmentsBuilder.
 * <p>
 * So, AppComponent --> ActivityBuilder --> FragmentsBuilder
 */
@Singleton
@Component(modules = {
    AndroidInjectionModule.class,
    AppModule.class,
    ActivityBuilder.class})
public interface AppComponent {

  void inject(SampleApp app);

  @Component.Builder
  interface Builder {

    @BindsInstance
    Builder application(Application application);

    AppComponent build();
  }
}
