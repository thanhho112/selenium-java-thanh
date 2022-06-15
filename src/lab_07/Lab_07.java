package lab_07;

import java.util.Arrays;

public class Lab_07 {

    public static void main(String[] args) {

        //8.1
        Employee fte1 = new FullTimeEmployee();
        Employee fte2 = new FullTimeEmployee();
        Employee fte3 = new FullTimeEmployee();
        Employee ce1 = new ContractEmployee();
        Employee ce2 = new ContractEmployee();

        EmployeeController employeeController = new EmployeeController();
        employeeController.calculateSalary(Arrays.asList(fte1,fte2,fte3,ce1,ce2));

        //8.2


    }


}
