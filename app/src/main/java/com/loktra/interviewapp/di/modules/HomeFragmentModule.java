package com.loktra.interviewapp.di.modules;

import dagger.Module;
import dagger.Provides;
import com.loktra.interviewapp.view.ui.home.HomeFragment;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

@Module
public class HomeFragmentModule {
    /*
    all the dependencies specific to the fragment must
    be listed here,optional you can skip this class creation
    if you dont have any dependencies specific to this fragment
     */

    @Provides
//    @Singleton
    public HomeFragment providesBlankFragment(HomeFragment homeFragment){
        return homeFragment;
    }
}
