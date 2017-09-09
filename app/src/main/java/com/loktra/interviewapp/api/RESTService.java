package com.loktra.interviewapp.api;

import com.loktra.interviewapp.data.model.ProjectResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ashif
 * github.com/SheikhZayed
 */

public interface RESTService {

    @GET("repos/rails/rails/commits?page=1&per_page=25")
    Call<List<ProjectResponse>> getRepoDetails();
}
