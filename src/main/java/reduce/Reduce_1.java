package reduce;

import java.util.Arrays;
import java.util.List;

public class Reduce_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
        String combined = list.stream().reduce("", (str1, str2) -> str1.toUpperCase() + str2.toUpperCase());
        System.out.println(combined);

        List<Employee> employeeList = Employee.getEmployeeList();
        Integer totalSal = employeeList.stream().reduce(0, (salary, e2) -> salary + e2.getSalary(), Integer::sum);
        System.out.println(totalSal);
    }
}
