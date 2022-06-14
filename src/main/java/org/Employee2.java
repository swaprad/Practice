package org;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee2 {
    private int id;
    private String name;
    private String city;
    private Integer age;
    private double salary;
    private Department dept;
}
