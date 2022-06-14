package org;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String city;
    private Integer age;
    private double salary;
}
