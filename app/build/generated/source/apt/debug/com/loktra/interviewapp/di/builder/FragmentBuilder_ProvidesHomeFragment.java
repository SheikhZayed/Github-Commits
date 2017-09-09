package com.loktra.interviewapp.di.builder;

import android.support.v4.app.Fragment;
import com.loktra.interviewapp.di.modules.HomeFragmentModule;
import com.loktra.interviewapp.view.ui.home.HomeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentBuilder_ProvidesHomeFragment.HomeFragmentSubcomponent.class)
public abstract class FragmentBuilder_ProvidesHomeFragment {
  private FragmentBuilder_ProvidesHomeFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(HomeFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      HomeFragmentSubcomponent.Builder builder);

  @Subcomponent(modules = HomeFragmentModule.class)
  public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeFragment> {}
  }
}
