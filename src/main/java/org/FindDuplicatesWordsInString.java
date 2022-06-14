package org;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicatesWordsInString {
    public static void main(String[] args) {

        String str = "I am am learning java java";

        List<String> words = Stream.of(str.split(" ")).collect(Collectors.toList());

        //using collections.frequency
        Map<String, Integer> map = words.stream()
                .filter(c -> Collections.frequency(words, c) > 1)
                .distinct()
                .collect(Collectors.toMap(Function.identity(), c -> Collections.frequency(words, c)));
        System.out.println(map);

        //using grouping by
        Map<String, Long> map2 = words.stream()
                .filter(c -> Collections.frequency(words, c) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map2);
    }
}
