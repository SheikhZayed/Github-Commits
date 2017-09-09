package com.loktra.interviewapp.data.repo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.loktra.interviewapp.api.RESTService;
import com.loktra.interviewapp.conf.AppExecutors;
import com.loktra.interviewapp.data.model.ProjectResponse;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

@Singleton
public class CommitRepository {

  private RESTService mApiService;
  private AppExecutors mAppExecutors;

  @Inject
  public CommitRepository(RESTService mApiService,
                          AppExecutors mAppExecutors) {
    this.mApiService = mApiService;
    this.mAppExecutors = mAppExecutors;
  }

  public LiveData<List<ProjectResponse>> getCommitList() {
    final MutableLiveData<List<ProjectResponse>> commitLivedata = new MutableLiveData<>();
    mApiService.getRepoDetails().enqueue(new Callback<List<ProjectResponse>>() {
      @Override
      public void onResponse(Call<List<ProjectResponse>> call, Response<List<ProjectResponse>> response) {
        if (response.isSuccessful()){
            commitLivedata.setValue(response.body());
        }
      }

      @Override
      public void onFailure(Call<List<ProjectResponse>> call, Throwable t) {
        Timber.d(t.getMessage());
        commitLivedata.setValue(null);
      }
    });

    return commitLivedata;
  }
}
