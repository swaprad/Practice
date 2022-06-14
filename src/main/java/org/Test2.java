package org;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Swapnil", "Pune", 35, 10000));
        list.add(new Employee(102, "Rahul", "Mumbai", 20, 20000));
        list.add(new Employee(103, "Samir", "Mumbai", 23, 40000));
        list.add(new Employee(104, "Deepak", "Pune", 27, 10000));
        list.add(new Employee(105, "Samiksha", "Pune", 30, 40000));

        BiFunction<Employee, Integer, Employee> bf = (employee, value) -> {
            employee.setSalary(employee.getSalary() + employee.getSalary()*value/100);
            return employee;
        };
        BiConsumer<Employee, Integer> bc =
                (employee, incrementPercentage) -> employee.setSalary(employee.getSalary() + employee.getSalary() * incrementPercentage / 100);

        list.stream()
                .filter(e -> e.getAge() > 25)
                .forEach(e -> bc.accept(e, 10));
        list.stream().filter(e -> e.getAge() > 25).forEach(System.out::println);
        System.out.println("------------------------------1");

        List<Employee> list2 = list.stream()
                .filter(e -> e.getAge() > 25)
                .map(e -> bf.apply(e, 10))
                .collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
        System.out.println("---------------------------------2");

        //grouping by
        List<String> names = list.stream().collect(Collectors.mapping((Employee::getName), Collectors.toList()));
        String names2 = names.stream().collect(Collectors.joining(", "));
        System.out.println(names2);
        System.out.println("----------------------------3");

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

    }
}
