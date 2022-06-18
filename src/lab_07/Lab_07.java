package lab_07;

import java.util.Arrays;
import java.util.List;

public class Lab_07 {

    public static void main(String[] args) {

        //1.1
        System.out.println("lab 7.1: Total salary of employee");
        Employee fte1 = new FullTimeEmployee();
        Employee fte2 = new FullTimeEmployee();
        Employee fte3 = new FullTimeEmployee();
        Employee ce1 = new ContractEmployee();
        Employee ce2 = new ContractEmployee();

        EmployeeController employeeController = new EmployeeController();
        employeeController.calculateSalary(Arrays.asList(fte1,fte2,fte3,ce1,ce2));

        //8.2
        System.out.println("lab 7.2: Racing animal simple version");
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal horse = new Horse();

        System.out.println(Arrays.asList(dog,tiger,horse));

        Animal winner = AnimalController.racingWinner(Arrays.asList(dog,tiger,horse));
        System.out.println("Winner is " + winner.getAnimalName() + ", with speed: " + winner.getSpeed());

    }
}
