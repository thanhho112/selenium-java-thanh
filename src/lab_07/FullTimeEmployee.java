package lab_07;

public class FullTimeEmployee extends Employee{

    private final int SALARY = 50000;

    @Override
    public int salary() {
        return SALARY;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "SALARY=" + SALARY +
                '}';
    }
}
