package org.java8;

import org.data.City;
import org.data.DemoData;
import org.data.Person;

import java.util.*;
import java.util.stream.Collectors;


public class Collect_groupingBy_mapping {
    public static void main(String[] args) {
        List<Person> people = DemoData.getPersonList();
        people.stream().forEach(System.out::println);

        Map<City, Set<String>> lastNamesByCity =
                people.stream().collect(Collectors.groupingBy(Person::getCity,
                        Collectors.mapping(Person::getLastName, Collectors.toSet())));
        lastNamesByCity.forEach((key, value) -> System.out.println(key + " : " + value));

    }

}
