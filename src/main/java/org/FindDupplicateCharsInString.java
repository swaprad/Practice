package org;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDupplicateCharsInString {
    public static void main(String[] args) {
        String str = "swapnil patil";
        List<Character> chars = str.chars().boxed().map(i -> (char) i.intValue()).collect(Collectors.toList());

        //using collections.frequency
        Map<Character, Integer> map1 = chars.stream().distinct()
                .filter(c -> Collections.frequency(chars, c) > 1)
                .collect(Collectors.toMap(Function.identity(), ch -> Collections.frequency(chars, ch)));
        System.out.println(map1);
        System.out.println("-------------------------------");

        //using grouping by
        Map<Character, Long> map3 = chars.stream()
                .filter(c -> Collections.frequency(chars, c) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map3);
        System.out.println("--------------------------------");

        //using traditional for each loop and map computeIfPresent and computeIfAbsent
        HashMap<Character, Integer> map2 = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map2.computeIfPresent(c, (key, value) -> value + 1);
            map2.putIfAbsent(c, 1);
        }
        map2.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .forEach(e -> System.out.print(e.getKey() + "=" + e.getValue() + ", "));
    }
}
