package org.maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMap_1 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(4, "four");
        map.put(2, "two");
        map.put(5, "five");
        map.put(3, "three");

        System.out.println(map);
        Map.Entry<Integer, String> e = map.floorEntry(5);
        System.out.println(e);
        Integer i = map.floorKey(6);
        System.out.println(i);

    }
}
