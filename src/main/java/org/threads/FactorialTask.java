package org.threads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.Callable;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactorialTask implements Callable<Long> {
    int number;

    public Long call() {
        return LongStream.rangeClosed(1, number).reduce(1L, (fact, n) -> fact*n);
    }
}