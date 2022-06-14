package org;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        String fibonacci = Stream.iterate(new int[]{1, 2}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(t -> t[0])
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(fibonacci);
    }
}
