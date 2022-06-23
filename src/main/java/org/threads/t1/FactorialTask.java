package org.threads.t1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.Callable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactorialTask implements Callable<Integer> {
    int number;

    public Integer call() {
        int fact = 1;
        for (int count = number; count > 1; count--) {
            fact = fact * count;
        }
        return fact;
    }
}