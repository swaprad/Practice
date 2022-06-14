package org;

import java.util.Arrays;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(16,44,8,84,6,87,2,47,49);
        Integer[] arr = {16,44,8,84,6,87,2,47,49};
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.stream(arr2).forEach(System.out::println);

        Integer[] arr3 = Arrays.copyOfRange(arr, 1, 5);
        Arrays.stream(arr3).forEach(System.out::println);

        System.out.println(Arrays.equals(arr, arr2));

        Employee[] emp1 = {new Employee(101, "Swapnil", "Pune", 35, 100000),
                new Employee(102, "Rahul", "Pune", 33, 115000),
                new Employee(103, "Raj", "Mumbai", 36, 125000)};
        Employee[] emp2 = {new Employee(101, "Swapnil", "Pune", 35, 100000),
                new Employee(102, "Rahul", "Pune", 33, 115000),
                new Employee(103, "Raj", "Mumbai", 36, 125000)};
        System.out.println(Arrays.equals(emp1, emp2));
        System.out.println(Arrays.deepEquals(emp1, emp2));
        System.out.println(emp1 == emp2);

    }
}
