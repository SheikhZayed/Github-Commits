package com.loktra.interviewapp.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import com.loktra.interviewapp.view.ui.MainActivity;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

@Module
public class MainActivityModule {

    /*
   all the dependencies specific to the activity must
   be listed here,optional you can skip this class creation
   if you dont have any dependencies specific to this activity
    */

    @Provides
    @Singleton
    public MainActivity providesMainActivty(MainActivity mainActivity){
        return mainActivity;
    }
}
