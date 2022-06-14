package org;

import java.math.BigInteger;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbers {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> !IntStream.range(2, n/2).boxed().anyMatch(i -> n % i == 0);
        IntStream.rangeClosed(1, 20).boxed().filter(n -> isPrime.test(n)).forEach(System.out::println);
        System.out.println("--------------------------------");
        Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
                .limit(10)
                .forEach(System.out::println);
    }
}