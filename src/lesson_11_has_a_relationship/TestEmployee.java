package lesson_11_has_a_relationship;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {

        Employee teo = new Employee("anhteo",18,18);
        Employee ti = new Employee("nhocti",11,20);
        Employee tun = new Employee("contun",9,19);

        List<Employee> employeeList = Arrays.asList(teo, ti, tun);
        System.out.println("BEFORE===========");
        System.out.println(employeeList);

        System.out.println("AFTER===========");
        Collections.sort(employeeList);
        System.out.println(employeeList);

        System.out.println("Sort by Age===========");
//        Collections.sort(employeeList);
        employeeList.sort(new EmployeeAgeComparator());
        System.out.println(employeeList);

        System.out.println("Sort by Name===========");
        employeeList.sort(new EmployeeNameComparator());
        System.out.println(employeeList);
    }
}
