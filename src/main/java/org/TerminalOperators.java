package org;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class TerminalOperators {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"swapnil1", "Pune", 23, 35000));
        list.add(new Employee(102,"swapnil2", "Mumbai", 28, 40000));
        list.add(new Employee(103,"swapnil3", "Pune", 35, 55000));
        list.add(new Employee(104,"swapnil4", "Mumbai", 45, 25000));
        list.add(new Employee(105,"swapnil5", "Pune", 33, 85000));
        list.add(new Employee(106,"swapnil6", "Pune", 27, 95000));

        Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(max.get());

        Optional<Employee> maxAge = list.stream().reduce(BinaryOperator.maxBy(Comparator.comparing(Employee::getAge)));
        System.out.println(maxAge.get());

        Optional<Employee> minAge = list.stream().reduce(BinaryOperator.minBy(Comparator.comparing(Employee::getAge)));
        System.out.println(minAge.get());


    }
}
