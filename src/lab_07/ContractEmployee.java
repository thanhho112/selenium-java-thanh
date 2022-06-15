package lab_07;

public class ContractEmployee extends Employee{
    private final int SALARY = 40000;

    @Override
    public int salary() {
        return SALARY;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "SALARY=" + SALARY +
                '}';
    }
}
