package com.loktra.interviewapp.di.builder;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.loktra.interviewapp.di.modules.HomeFragmentModule;
import com.loktra.interviewapp.view.ui.home.HomeFragment;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */
@Module
public abstract class FragmentBuilder {
    /*
    all the fragments which are to be attached to
    dagger should be listed here
     */

    @ContributesAndroidInjector(modules = HomeFragmentModule.class)
    abstract HomeFragment providesHomeFragment();
}
