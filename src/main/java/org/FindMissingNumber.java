package org;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMissingNumber {

    public static void main(String[] args) {

        int n = 10;
        List<Integer> list = Stream.iterate(1, t -> t + 1).limit(n).collect(Collectors.toList());
        list.remove((new Random()).nextInt(n));
        list.stream().forEach(System.out::println);

        int sum1 = (n*(n+1))/2;
        int sum2 = list.stream().mapToInt(Integer::intValue).sum();
        Integer sum3 = list.stream().collect(Collectors.summingInt(Integer::intValue));
        Integer sum4 = list.stream().reduce(0, (v1, v2) -> v1 + v2);
        System.out.println("sum1= " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
        System.out.println("missing number=" + (sum1-sum2));
    }
}
