package org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Swapnil", "Pune", 35, 10000));
        list.add(new Employee(102, "Rahul", "Mumbai", 20, 20000));
        list.add(new Employee(103, "Samir", "Mumbai", 23, 40000));
        list.add(new Employee(104, "Deepak", "Pune", 27, 10000));
        list.add(new Employee(105, "Samiksha", "Pune", 30, 40000));

        List<String> names = list.stream().collect(Collectors.mapping((Employee::getName), Collectors.toList()));
        String names2 = names.stream().collect(Collectors.joining(", "));
        System.out.println(names2);
    }
}
