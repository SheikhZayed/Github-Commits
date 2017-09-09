package com.loktra.interviewapp.di.components;

import dagger.Subcomponent;
import com.loktra.interviewapp.view.ui.home.HomeViewModel;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

@Subcomponent
public interface VMSubComponent {
    @Subcomponent.Builder
    interface Builder {
        VMSubComponent build();
    }

    HomeViewModel homeViewModel();
    //all viewmodel should be listed here.
}
