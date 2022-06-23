package org.threads.t1;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FactorialTaskMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        FactorialTask task = new FactorialTask(5);
        Future<Integer> future = executorService.submit(task);
        System.out.println(future.get());
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
