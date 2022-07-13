package org.threads;

import java.util.concurrent.*;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Integer number = 10;
        Callable<Integer> callableTask = () -> {
            int fact = 1;
            for (int count = number; count > 1; count--) {
                fact = fact * count;
            }
            return fact;
        };
        ScheduledFuture<Integer> schedule = executorService.schedule(callableTask, 1, TimeUnit.SECONDS);
    }
}
