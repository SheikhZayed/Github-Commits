package com.loktra.interviewapp.data;

import android.arch.core.executor.testing.InstantTaskExecutorRule;
import com.loktra.interviewapp.util.InstantAppExecutor;
import com.loktra.interviewapp.api.RESTService;
import com.loktra.interviewapp.data.repo.CommitRepository;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Ashif Ismail
 */

@RunWith(JUnit4.class) public class CommitRepositoryTest {

  private CommitRepository commitRepository;
  private RESTService restService;
  private MockWebServer mockWebServer;
  @Rule public InstantTaskExecutorRule instantExecutorRule = new InstantTaskExecutorRule();

  @Before public void init() {

    mockWebServer = new MockWebServer();
    restService = new Retrofit.Builder().baseUrl(mockWebServer.url(" ").toString())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RESTService.class);
    commitRepository = new CommitRepository(restService,new InstantAppExecutor());
  }

  /**
   * testing if the commit list has valid data
   * or not,when the dependencies are set
   */
  @Test
  public void getCommitListNotNull(){
    Assert.assertNotNull(commitRepository.getCommitList());
  }

  /**
   * testing if the livedata has any active observer or not
   * it should not have,because the observer is called in fragments onCreateView,
   * since fragment is not created yet,it should not have any active observer
   */
  @Test
  public void getActiveObservers(){
    Assert.assertTrue(!commitRepository.getCommitList().hasActiveObservers());
  }
}
