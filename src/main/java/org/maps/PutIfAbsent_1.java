package org.maps;
// Java program to demonstrate
// putIfAbsent(Key, value) method.

import java.util.HashMap;

public class PutIfAbsent_1 {
    // Main method
    public static void main(String[] args) {
        // create a HashMap and add some values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10000);
        map.put("b", 55000);
        map.put("c", 44300);
        map.put("e", 53200);

        // print original map
        System.out.println("HashMap: " + map.toString());

        // put a new value which is not mapped
        // before in map
        map.putIfAbsent("d", 77633);

        System.out.println("New HashMap: " + map);

        // try to put a new value with existing key
        // before in map
        map.putIfAbsent("d", 55555);

        // print newly mapped map
        System.out.println("Unchanged HashMap: " + map);
    }
}

