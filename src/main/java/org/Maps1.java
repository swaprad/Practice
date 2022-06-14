package org;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("one", 1);map.put("two", 2);map.put("three", 3);
        map.put("four", 4);map.put("five", 5);map.put("six", 6);
        map.put("sever", 7);

        map.computeIfAbsent("ten", t -> 10);
        map.computeIfPresent("one", (key, value) -> value*2);

        map.putIfAbsent("one", 12);

        System.out.println(map.isEmpty());

        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.putAll(map);

        map2.replaceAll((key, oldValue) -> oldValue + 100);
        map2.replace("one", 0);
        map2.replace("one", 2, 1111111);

        System.out.println(map2.getOrDefault("hundred", 100));


        map2.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });
    }
}
