package reduce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private Department department;
    private Integer salary;

    public static List<Employee> getEmployeeList() {
        List<Employee> list = new ArrayList<>();
        Address address1 = new Address("Pune");
        Address address2 = new Address("Mumbai");
        Department department1 = new Department(10, address1);
        Department department2 = new Department(11, address2);
        Department department3 = new Department(12, address1);
        Employee e1 = new Employee(101, "Ramesh", department1, 100000);
        Employee e2 = new Employee(101, "Ramesh", department2, 75000);
        Employee e3 = new Employee(101, "Ramesh", department1, 115000);
        Employee e4 = new Employee(101, "Ramesh", department3, 125000);
        Employee e5 = new Employee(101, "Ramesh", department2, 90000);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        return list;
    }
}
