package org;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class SortingAndCovertingToMap {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Swapnil"); list1.add("Rahul"); list1.add("Ramesh"); list1.add("Felix"); list1.add("Dinesh");
        list1.stream().sorted().forEach(System.out::println);
        Map<String, String> map00 = list1.stream()
                .collect(Collectors.toMap(s -> s.toUpperCase(), s -> s.toLowerCase()));
        map00.entrySet().stream().forEach(System.out::println);
        System.out.println("-----------------------------------------");

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Swapnil", "Pune", 35, 20000));
        list.add(new Employee(102, "Rahul", "Mumbai", 32,10000));
        list.add(new Employee(103, "Ramesh", "Bengalore", 37, 90000));
        list.add(new Employee(104, "Felix", "Delhi", 30, 45000));
        list.add(new Employee(105, "Dinesh", "Hyderabad", 28, 70000));
        List<Employee> sorted1 = list.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
                .collect(Collectors.toList());
        sorted1.stream().forEach(System.out::println);
        Map<String, String> map0 = list.stream().collect(Collectors.toMap(Employee::getName, Employee::getCity));
        map0.entrySet().stream().forEach(System.out::println);
        System.out.println("-----------------------------------------");

        Map<Integer, Employee> map = new HashMap<>();
        map.put(101, new Employee(101, "Swapnil", "Pune", 35, 20000));
        map.put(102, new Employee(102, "Rahul", "Mumbai", 32, 90000));
        map.put(103, new Employee(103, "Ramesh", "Bengalore", 37, 50000));
        map.put(104, new Employee(104, "Felix", "Delhi", 30, 35000));
        map.put(105, new Employee(105, "Dinesh", "Hyderabad", 28, 100000));
        Map<Integer, Employee> map2 = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getAge)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (prev, next) -> next, LinkedHashMap::new));
        map2.entrySet().stream().forEach(System.out::println);


    }
}
