package org.data;

import java.util.ArrayList;
import java.util.List;

public class DemoData {
    /**
     * City pune = new City("PUNE");
     * City mumbai = new City("MUMBAI");
     * City bangalore = new City("BANGALORE");
     * List<Person> people = new ArrayList<>();
     * people.add(new Person("Raj", "Malhotra", pune));
     * people.add(new Person("Rahul", "Patil", mumbai));
     * people.add(new Person("Simran", "Joshi", bangalore));
     * people.add(new Person("Vicky", "Patil", pune));
     * people.add(new Person("Ramesh", "Joshi", bangalore));
     * @return
     */
    public static List<Person> getPersonList() {
        City pune = new City("PUNE");
        City mumbai = new City("MUMBAI");
        City bangalore = new City("BANGALORE");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Raj", "Malhotra", pune));
        people.add(new Person("Rahul", "Patil", mumbai));
        people.add(new Person("Simran", "Joshi", bangalore));
        people.add(new Person("Vicky", "Patil", pune));
        people.add(new Person("Ramesh", "Joshi", bangalore));
        return people;
    }

    /**
     *
     * @return List<Employee> list = new ArrayList<>();
     *         list.add(new Employee(101,"Raj", "Pune", 23, 35000));
     *         list.add(new Employee(102,"Rahul", "Mumbai", 28, 40000));
     *         list.add(new Employee(103,"Simran", "Pune", 35, 55000));
     *         list.add(new Employee(104,"Vicky", "Mumbai", 45, 25000));
     *         list.add(new Employee(105,"Ramesh", "Pune", 33, 85000));
     */
    public static List<Employee> getEmployeeList() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"Raj", "Pune", 23, 35000));
        list.add(new Employee(102,"Rahul", "Mumbai", 28, 40000));
        list.add(new Employee(103,"Simran", "Pune", 35, 55000));
        list.add(new Employee(104,"Vicky", "Mumbai", 45, 25000));
        list.add(new Employee(105,"Ramesh", "Pune", 33, 85000));
        return list;
    }
}
