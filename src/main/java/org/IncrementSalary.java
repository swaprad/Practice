package org;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class IncrementSalary {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Swapnil", "Pune", 30, 10000));
        list.add(new Employee(102, "Rahul", "Mumbai", 20, 20000));
        list.add(new Employee(103, "Samir", "Mumbai", 23, 40000));
        list.add(new Employee(104, "Deepak", "Pune", 27, 10000));
        list.add(new Employee(105, "Samiksha", "Pune", 35, 40000));

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
        System.out.println("------------------------------");

        List<Employee> list2 = list.stream()
                .filter(e -> e.getAge() > 25)
                .map(e -> bf.apply(e, 10))
                .collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
    }
}
