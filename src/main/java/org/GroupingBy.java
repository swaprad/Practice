package org;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {
        Department dept1 = new Department(10, "Pune");
        Department dept2 = new Department(20, "Mumbai");
        List<Employee2> employees = new ArrayList<>();
        employees.add(new Employee2(101, "Swapnil", "Pune", 35, 10000, dept1));
        employees.add(new Employee2(102, "Rahul", "Mumbai", 20, 20000, dept2));
        employees.add(new Employee2(103, "Samir", "Mumbai", 23, 40000, dept2));
        employees.add(new Employee2(104, "Deepak", "Pune", 27, 10000, dept1));
        employees.add(new Employee2(105, "Samiksha", "Pune", 30, 40000, dept2));

        Map<Department, Set<Employee2>> map = employees.stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.toSet()));
        map.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });
        System.out.println("--------------------------------4");
        Map<Department, Map<String, List<Employee2>>> map2 = employees.stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.groupingBy(Employee2::getCity)));
        map2.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " --- ");
            e.getValue().entrySet().stream().forEach(e1 -> {
                System.out.println(e1.getKey() + " : " + e1.getValue());
            });
        });
        System.out.println("-------------------------5");
        Map<Department, Double> map3 = employees.stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.averagingDouble(Employee2::getSalary)));
        map3.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });
        System.out.println("---------------------------6");
        Map<Department, Double> map4 = employees.stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.summingDouble(Employee2::getSalary)));
        System.out.println(map4);
        System.out.println("----------------------------7");
        Map<String, DoubleSummaryStatistics> map5 = employees.stream().collect(Collectors.groupingBy(Employee2::getCity, Collectors.summarizingDouble(Employee2::getSalary)));
        map5.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + " : " + e.getValue());
        });



        List<String> list = new ArrayList<>();
        list.add("Sun");list.add("Moon");list.add("Jupiter");list.add("Urenus");
        list.add("Sun");list.add("Moon");list.add("Jupiter");
        Map<String, Long> m = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(m);
        Set<String> duplicates3 = m
                .entrySet().stream()
                .filter(e -> e.getValue()>1)
                .map(e -> e.getKey())
                .collect(Collectors.toSet());
        System.out.println(duplicates3);
    }
}
