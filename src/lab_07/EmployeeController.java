package lab_07;

import java.util.List;

public class EmployeeController {

    public void calculateSalary(List<Employee> employeeLíst){

        int total = 0;
        if (employeeLíst == null){
            throw new IllegalArgumentException("Employee List cannot be NULL");
        }
        for (int i = 0; i < employeeLíst.size(); i++) {
            total += employeeLíst.get(i).salary();
        }
        System.out.println("Total salary = " + total);
    }
}
