package com.loktra.interviewapp.util;

import com.loktra.interviewapp.conf.AppExecutors;
import java.util.concurrent.Executor;

/**
 * @author Ashif Ismail
 */

public class InstantAppExecutor extends AppExecutors {
    private static Executor instant = command -> command.run();

    public InstantAppExecutor() {
      super(instant, instant, instant);
    }
  }

