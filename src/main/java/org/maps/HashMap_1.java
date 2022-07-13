package org.maps;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap_1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Raj", "Pune");
        Employee e4 = new Employee(101, "Raj", "Pune");
        Employee e2 = new Employee(102, "Sumit", "Mumbai");
        Employee e3 = new Employee(103, "Samir", "Solapur");

        Set<Employee> set = new HashSet<>();
        set.add(e1); set.add(e2); set.add(e3);set.add(e4);
        set.forEach(System.out::println);
    }
}
