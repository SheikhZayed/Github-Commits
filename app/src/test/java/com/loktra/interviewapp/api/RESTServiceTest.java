package com.loktra.interviewapp.api;

import android.arch.core.executor.testing.InstantTaskExecutorRule;
import com.loktra.interviewapp.api.RESTService;
import com.loktra.interviewapp.data.model.ProjectResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okio.BufferedSource;
import okio.Okio;
import org.junit.After;
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

@RunWith(JUnit4.class) public class RESTServiceTest {

  @Rule public InstantTaskExecutorRule instantExecutorRule = new InstantTaskExecutorRule();

  private RESTService restService;
  private MockWebServer mockWebServer;

  @Before public void createService() throws IOException {
    mockWebServer = new MockWebServer();
    restService = new Retrofit.Builder().baseUrl(mockWebServer.url(" ").toString())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RESTService.class);
  }

  @After public void teardown() throws IOException {
    mockWebServer.shutdown();
  }

  /**
   * testing if the mock commits json file
   * has data or not
   *
   * @throws IOException
   */
  @Test public void getCommitsShouldNotBeNull() throws IOException {
    BufferedSource source = enqueueResponse("railscommit.json");
    mockWebServer.enqueue(new MockResponse().setBody(source.readString(StandardCharsets.UTF_8)));

    retrofit2.Call<List<ProjectResponse>> call = restService.getRepoDetails();

    Assert.assertTrue(call.execute() != null);
  }

  /**
   * testing if the First Author name in the response json
   * matches with the mock api call
   *
   * @throws IOException
   */
  @Test public void getCommitAuthorNameShouldMatchInMockFile() throws IOException {
    BufferedSource source = enqueueResponse("railscommit.json");
    mockWebServer.enqueue(new MockResponse().setBody(source.readString(StandardCharsets.UTF_8)));

    retrofit2.Call<List<ProjectResponse>> call = restService.getRepoDetails();

    Assert.assertEquals("Ryuta Kamizono",
        call.execute().body().get(0).getCommit().getAuthor().getName());
  }

  /**
   * testing if the First Author email in the response json
   * matches with the mock api call
   *
   * @throws IOException
   */
  @Test public void getAuthorEmailShouldMatchInMockFile() throws IOException {
    BufferedSource source = enqueueResponse("railscommit.json");
    mockWebServer.enqueue(new MockResponse().setBody(source.readString(StandardCharsets.UTF_8)));

    retrofit2.Call<List<ProjectResponse>> call = restService.getRepoDetails();

    Assert.assertEquals("kamipo@gmail.com",
        call.execute().body().get(0).getCommit().getAuthor().getEmail());
  }

  /**
   * testing if the author details in the response file
   * matches with the mock server data
   * @throws IOException
   */
  @Test public void getFirstCommitterDetails() throws IOException {
    BufferedSource source = enqueueResponse("railscommit.json");
    mockWebServer.enqueue(new MockResponse().setBody(source.readString(StandardCharsets.UTF_8)));

    retrofit2.Call<List<ProjectResponse>> call = restService.getRepoDetails();

    int id = 12642;
    String avatar = "https://avatars0.githubusercontent.com/u/12642?v=4";
    String githubHandler = "https://api.github.com/users/kamipo";

    List<ProjectResponse> projectResponses = call.execute().body();

    Assert.assertEquals(githubHandler, projectResponses.get(0).getAuthor().getUrl());
    Assert.assertEquals(id,projectResponses.get(0).getAuthor().getId());
    Assert.assertEquals(avatar,projectResponses.get(0).getAuthor().getAvatar_url());
  }

  /**
   * method to return buffered source as endpoint for mock response
   *
   * @throws IOException
   */
  private BufferedSource enqueueResponse(String fileName) throws IOException {
    InputStream inputStream =
        getClass().getClassLoader().getResourceAsStream("api-response/" + fileName);
    BufferedSource source = Okio.buffer(Okio.source(inputStream));

    return source;
  }
}
