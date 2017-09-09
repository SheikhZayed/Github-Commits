package com.loktra.interviewapp.di.components;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.app.Fragment;
import com.loktra.interviewapp.api.LoggingInterceptor;
import com.loktra.interviewapp.api.RESTService;
import com.loktra.interviewapp.conf.AppExecutors;
import com.loktra.interviewapp.conf.AppExecutors_Factory;
import com.loktra.interviewapp.conf.SampleApp;
import com.loktra.interviewapp.conf.SampleApp_MembersInjector;
import com.loktra.interviewapp.data.repo.CommitRepository;
import com.loktra.interviewapp.data.repo.CommitRepository_Factory;
import com.loktra.interviewapp.di.builder.ActivityBuilder_ProvidesMainActivity;
import com.loktra.interviewapp.di.builder.FragmentBuilder_ProvidesHomeFragment;
import com.loktra.interviewapp.di.modules.AppModule;
import com.loktra.interviewapp.di.modules.AppModule_ProvideDialogUtilsFactory;
import com.loktra.interviewapp.di.modules.AppModule_ProvideViewModelFactoryFactory;
import com.loktra.interviewapp.di.modules.AppModule_ProvidesApiServiceFactory;
import com.loktra.interviewapp.di.modules.AppModule_ProvidesAppUtilsFactory;
import com.loktra.interviewapp.di.modules.AppModule_ProvidesHttpCacheFactory;
import com.loktra.interviewapp.di.modules.AppModule_ProvidesOkHttpClientFactory;
import com.loktra.interviewapp.di.modules.AppModule_ProvidesRequestInterceptorFactory;
import com.loktra.interviewapp.util.AppUtils;
import com.loktra.interviewapp.util.DialogUtils;
import com.loktra.interviewapp.view.ui.MainActivity;
import com.loktra.interviewapp.view.ui.MainActivity_MembersInjector;
import com.loktra.interviewapp.view.ui.home.HomeFragment;
import com.loktra.interviewapp.view.ui.home.HomeFragment_MembersInjector;
import com.loktra.interviewapp.view.ui.home.HomeViewModel;
import com.loktra.interviewapp.view.ui.home.HomeViewModel_Factory;
import dagger.MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityBuilder_ProvidesMainActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider;

  private Provider<
          Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>>
      mapOfClassOfAndProviderOfFactoryOfProvider;

  private Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  private MembersInjector<SampleApp> sampleAppMembersInjector;

  private Provider<AppUtils> providesAppUtilsProvider;

  private Provider<VMSubComponent.Builder> vMSubComponentBuilderProvider;

  private Provider<ViewModelProvider.Factory> provideViewModelFactoryProvider;

  private Provider<DialogUtils> provideDialogUtilsProvider;

  private Provider<Application> applicationProvider;

  private Provider<LoggingInterceptor> providesRequestInterceptorProvider;

  private Provider<Cache> providesHttpCacheProvider;

  private Provider<OkHttpClient> providesOkHttpClientProvider;

  private Provider<RESTService> providesApiServiceProvider;

  private Provider<AppExecutors> appExecutorsProvider;

  private Provider<CommitRepository> commitRepositoryProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.mainActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityBuilder_ProvidesMainActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityBuilder_ProvidesMainActivity.MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider = (Provider) mainActivitySubcomponentBuilderProvider;

    this.mapOfClassOfAndProviderOfFactoryOfProvider =
        MapProviderFactory
            .<Class<? extends Activity>, AndroidInjector.Factory<? extends Activity>>builder(1)
            .put(MainActivity.class, bindAndroidInjectorFactoryProvider)
            .build();

    this.dispatchingAndroidInjectorProvider =
        DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider);

    this.sampleAppMembersInjector =
        SampleApp_MembersInjector.create(dispatchingAndroidInjectorProvider);

    this.providesAppUtilsProvider =
        DoubleCheck.provider(AppModule_ProvidesAppUtilsFactory.create(builder.appModule));

    this.vMSubComponentBuilderProvider =
        new dagger.internal.Factory<VMSubComponent.Builder>() {
          @Override
          public VMSubComponent.Builder get() {
            return new VMSubComponentBuilder();
          }
        };

    this.provideViewModelFactoryProvider =
        DoubleCheck.provider(
            AppModule_ProvideViewModelFactoryFactory.create(
                builder.appModule, vMSubComponentBuilderProvider));

    this.provideDialogUtilsProvider =
        DoubleCheck.provider(AppModule_ProvideDialogUtilsFactory.create(builder.appModule));

    this.applicationProvider = InstanceFactory.create(builder.application);

    this.providesRequestInterceptorProvider =
        DoubleCheck.provider(AppModule_ProvidesRequestInterceptorFactory.create(builder.appModule));

    this.providesHttpCacheProvider =
        DoubleCheck.provider(
            AppModule_ProvidesHttpCacheFactory.create(builder.appModule, applicationProvider));

    this.providesOkHttpClientProvider =
        DoubleCheck.provider(
            AppModule_ProvidesOkHttpClientFactory.create(
                builder.appModule, providesRequestInterceptorProvider, providesHttpCacheProvider));

    this.providesApiServiceProvider =
        DoubleCheck.provider(
            AppModule_ProvidesApiServiceFactory.create(
                builder.appModule, providesOkHttpClientProvider));

    this.appExecutorsProvider = DoubleCheck.provider(AppExecutors_Factory.create());

    this.commitRepositoryProvider =
        DoubleCheck.provider(
            CommitRepository_Factory.create(providesApiServiceProvider, appExecutorsProvider));
  }

  @Override
  public void inject(SampleApp app) {
    sampleAppMembersInjector.injectMembers(app);
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private Application application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (application == null) {
        throw new IllegalStateException(Application.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityBuilder_ProvidesMainActivity.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public ActivityBuilder_ProvidesMainActivity.MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityBuilder_ProvidesMainActivity.MainActivitySubcomponent {
    private Provider<FragmentBuilder_ProvidesHomeFragment.HomeFragmentSubcomponent.Builder>
        homeFragmentSubcomponentBuilderProvider;

    private Provider<AndroidInjector.Factory<? extends Fragment>>
        bindAndroidInjectorFactoryProvider;

    private Provider<
            Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>>
        mapOfClassOfAndProviderOfFactoryOfProvider;

    private Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

    private MembersInjector<MainActivity> mainActivityMembersInjector;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {

      this.homeFragmentSubcomponentBuilderProvider =
          new dagger.internal.Factory<
              FragmentBuilder_ProvidesHomeFragment.HomeFragmentSubcomponent.Builder>() {
            @Override
            public FragmentBuilder_ProvidesHomeFragment.HomeFragmentSubcomponent.Builder get() {
              return new HomeFragmentSubcomponentBuilder();
            }
          };

      this.bindAndroidInjectorFactoryProvider = (Provider) homeFragmentSubcomponentBuilderProvider;

      this.mapOfClassOfAndProviderOfFactoryOfProvider =
          MapProviderFactory
              .<Class<? extends Fragment>, AndroidInjector.Factory<? extends Fragment>>builder(1)
              .put(HomeFragment.class, bindAndroidInjectorFactoryProvider)
              .build();

      this.dispatchingAndroidInjectorProvider =
          DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider);

      this.mainActivityMembersInjector =
          MainActivity_MembersInjector.create(
              dispatchingAndroidInjectorProvider, DaggerAppComponent.this.providesAppUtilsProvider);
    }

    @Override
    public void inject(MainActivity arg0) {
      mainActivityMembersInjector.injectMembers(arg0);
    }

    private final class HomeFragmentSubcomponentBuilder
        extends FragmentBuilder_ProvidesHomeFragment.HomeFragmentSubcomponent.Builder {
      private HomeFragment seedInstance;

      @Override
      public FragmentBuilder_ProvidesHomeFragment.HomeFragmentSubcomponent build() {
        if (seedInstance == null) {
          throw new IllegalStateException(HomeFragment.class.getCanonicalName() + " must be set");
        }
        return new HomeFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(HomeFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class HomeFragmentSubcomponentImpl
        implements FragmentBuilder_ProvidesHomeFragment.HomeFragmentSubcomponent {
      private MembersInjector<HomeFragment> homeFragmentMembersInjector;

      private HomeFragmentSubcomponentImpl(HomeFragmentSubcomponentBuilder builder) {
        assert builder != null;
        initialize(builder);
      }

      @SuppressWarnings("unchecked")
      private void initialize(final HomeFragmentSubcomponentBuilder builder) {

        this.homeFragmentMembersInjector =
            HomeFragment_MembersInjector.create(
                DaggerAppComponent.this.provideViewModelFactoryProvider,
                DaggerAppComponent.this.provideDialogUtilsProvider);
      }

      @Override
      public void inject(HomeFragment arg0) {
        homeFragmentMembersInjector.injectMembers(arg0);
      }
    }
  }

  private final class VMSubComponentBuilder implements VMSubComponent.Builder {
    @Override
    public VMSubComponent build() {
      return new VMSubComponentImpl(this);
    }
  }

  private final class VMSubComponentImpl implements VMSubComponent {
    private Provider<HomeViewModel> homeViewModelProvider;

    private VMSubComponentImpl(VMSubComponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final VMSubComponentBuilder builder) {

      this.homeViewModelProvider =
          HomeViewModel_Factory.create(
              MembersInjectors.<HomeViewModel>noOp(),
              DaggerAppComponent.this.applicationProvider,
              DaggerAppComponent.this.commitRepositoryProvider);
    }

    @Override
    public HomeViewModel homeViewModel() {
      return homeViewModelProvider.get();
    }
  }
}
