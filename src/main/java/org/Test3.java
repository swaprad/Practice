package org;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        String str = "swapnil patil";
        List<Integer> list = str.chars().boxed().collect(Collectors.toList());
        Map<Character, Integer> map = str.chars().boxed()
                .distinct()
                .collect(Collectors.toMap(ch -> (char) ch.intValue(), ch -> Collections.frequency(list, ch)));
        System.out.println(map);

        int f = Collections.frequency(list, 97);
        System.out.println("f = " + f);

        List<Integer> list2 = new ArrayList<>();
        list2.add(6); list2.add(3); list2.add(9);
        list2.add(4); list2.add(7);
        Integer temp = list2.stream().reduce(1, (a, b) -> a+b);
        System.out.println(temp);
    }
}
