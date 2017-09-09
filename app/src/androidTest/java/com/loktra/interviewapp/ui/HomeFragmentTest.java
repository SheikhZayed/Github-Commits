package com.loktra.interviewapp.ui;

import android.arch.lifecycle.MutableLiveData;
import android.content.Intent;
import android.os.SystemClock;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import com.loktra.interviewapp.R;
import com.loktra.interviewapp.data.model.ProjectResponse;
import com.loktra.interviewapp.view.ui.MainActivity;
import com.loktra.interviewapp.view.ui.home.HomeFragment;
import com.loktra.interviewapp.view.ui.home.HomeViewModel;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import util.TaskExecutorWithIdlingResourceRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Ashif on 9/9/2017.
 */

public class HomeFragmentTest {
  @Rule public ActivityTestRule<MainActivity> activityRule =
      new ActivityTestRule<>(MainActivity.class, true, true);

  @Rule public TaskExecutorWithIdlingResourceRule executorRule =
      new TaskExecutorWithIdlingResourceRule();
  private MutableLiveData<List<ProjectResponse>> commitLivedata = new MutableLiveData<>();
  private HomeFragment homeFragment;
  private HomeViewModel homeViewModel;

  @Before public void init() {
    homeFragment = HomeFragment.newInstance();
  }

  /**
   * testing if the recyclerview is populated
   * increase sleep time,if test fails.
   * this happens because until list is fully loaded the resource with ID R.id.list_content
   * is unavailable,
   *
   * happens because of flaky connections.. i guess :)
   */
  @Test public void testIfListPopulated() {
    commitLivedata.postValue(null);
    SystemClock.sleep(1500);
    onView(withId(R.id.list_content)).check(matches(isDisplayed()));
  }

  /**
   * testing if the dialog appears on recycler view item click
   *
   * this test may also fail sometimes ... reason as commented above
   * @throws InterruptedException
   */
  @Test public void clickFirstItem() throws InterruptedException {
    SystemClock.sleep(2500);
    onView(withId(R.id.list_content)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
    onView(withText("OK")).check(matches(isDisplayed()));
  }
}
