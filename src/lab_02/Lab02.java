package lab_02;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {

        //lab2.1: Get input from user about height(m) and weight(kg) then calculate BMI and give out suggestion
        evaluationBMI();

        //lab2.2a
        checkOddorEvenNumber();

    }
    private static void checkOddorEvenNumber() {

        final int CONDITION_NUMBER = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input check number: ");
        int checkNumber= scanner.nextInt();

        int result = checkNumber % CONDITION_NUMBER;
        boolean isNumber = result==0;
        System.out.println(result);
//        if (result == 0){
//            System.out.println("Even number");
//        }else {
//            System.out.println("Odd Number");
//        }
        String msg = isNumber ? "Even number": "Odd number";
        System.out.println(msg);

    }

    static void evaluationBMI() {  //Why use static for this method => if unused it shows error

        double suggestWeight =  0; //Why Data type = double, it's not float - all variable with data type are float??? => Show error when set FLOAT for suggestWeight

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight (kg): ");
        float userWeight= scanner.nextFloat();
        System.out.print("Input height (m):  ");
        float userHeight = scanner.nextFloat();


        double resultBMI = userWeight / (userHeight * 2);
        System.out.println("BMI of user: " + resultBMI);

        // <18.5 | 18.5-24.9 | 25 - 29.9 | 30
        //Give out the suggestion due to result of BMI for user to increase/decrease weight
        if (resultBMI <= 18.5 ){
            System.out.println("Under weight");
            suggestWeight = (18.5 * (userHeight * 2)) - userWeight;
            System.out.println("You need to increase(kg) : "+ suggestWeight);    // Lam sao su dung %
        } else if (resultBMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (resultBMI <= 29.9) {
            System.out.println("Over weight");
            suggestWeight = userWeight - (24.9 * (userHeight * 2));
            System.out.println("You need to lose weight(kg): "+ suggestWeight);
        }else {
            System.out.println("Obesity");
            suggestWeight = userWeight - (24.9 * (userHeight * 2));
            System.out.println("You need to lose weight(kg): "+ suggestWeight);
        }
    }

}
