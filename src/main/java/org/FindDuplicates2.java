package org;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates2 {
    public static void main(String[] args) {

        String str = "I am am learning java java";

        //duplicate words
        List<String> list = Stream.of(str.split(" ")).collect(Collectors.toList());
        Map<String, Integer> map = list.stream().filter(c -> Collections.frequency(list, c) > 1)
                .distinct()
                .collect(Collectors.toMap(c -> c, c -> Collections.frequency(list, c)));
        map.entrySet().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });
        System.out.println("------------------------");
        //characters
        HashMap<Character, Integer> counter = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            counter.computeIfPresent(c, (key, value) -> value + 1);
            counter.computeIfAbsent(c, v -> 1);
        }
        counter.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });
    }
}
