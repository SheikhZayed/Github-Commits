package com.loktra.interviewapp.view.ui.home;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.loktra.interviewapp.data.model.ProjectResponse;
import com.loktra.interviewapp.data.repo.CommitRepository;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

public class HomeViewModel extends AndroidViewModel {

    private final LiveData<List<ProjectResponse>> commitListObservable;

    @Inject
    public HomeViewModel(Application application, CommitRepository contentRepository) {
        super(application);
        this.commitListObservable = contentRepository.getCommitList();
    }

    public LiveData<List<ProjectResponse>> getCommitListObservable() {
        return commitListObservable;
    }
}
