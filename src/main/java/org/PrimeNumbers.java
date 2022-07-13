package org;

import java.math.BigInteger;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbers {
    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> IntStream.rangeClosed(2, n/2).boxed().noneMatch(i -> n % i == 0);
        IntStream.rangeClosed(2, 20).boxed().filter(isPrime::test).forEach(System.out::println);
        System.out.println("--------------------------------");
        Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
                .limit(10)
                .forEach(System.out::println);
    }
}