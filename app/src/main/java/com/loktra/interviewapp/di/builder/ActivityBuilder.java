package com.loktra.interviewapp.di.builder;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import com.loktra.interviewapp.view.ui.MainActivity;


/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

@Module
public abstract class ActivityBuilder {

    /*
    All activities that are to be attached to
    dagger should register here.

    Application has Activities,Activities has Fragments
     */

    @ContributesAndroidInjector(modules = FragmentBuilder.class)
    abstract MainActivity providesMainActivity();
}
