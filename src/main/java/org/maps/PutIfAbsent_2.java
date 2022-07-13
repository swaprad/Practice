package org.maps;
// Java program to demonstrate
// putIfAbsent(Key, value) method.

import java.util.*;

public class PutIfAbsent_2 {
    // Main method
    public static void main(String[] args) {
        // create a HashMap and add some values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10000);
        map.put("b", 55000);
        map.put("c", 44300);
        map.put("e", null);

        // print original map
        System.out.println("HashMap: " + map.toString());

        // put a new value which is not mapped
        // before in map and store the returned
        // value in r1
        Integer r1 = map.putIfAbsent("d", 77633);

        // put a new value for key 'e' which is mapped
        // with a null value, and store the returned
        // value in r2
        Integer r2 = map.putIfAbsent("e", 77633);

        // print the value of r1
        System.out.println("Value of r1: " + r1);

        // print the value of r2
        System.out.println("Value of r2: " + r2);

        // print newly mapped map
        System.out.println("New HashMap: " + map);
    }
}

