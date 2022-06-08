package lab_04;

import java.security.SecureRandom;
import java.util.*;

public class lab_04 {

    public static void main(String[] args) {

        List<Integer> intArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        intArray = inputArray();


        System.out.println();
        System.out.println("====MENU======");
        System.out.print("1. Print all numbers\n" +
                "2. Print maximum value\n" +
                "3. Print minimum value\n" +
                "4. Search number\n");

        System.out.print("Pls input menu with number that you want to choose: ");

        int userInput = scanner.nextInt();
//
//        while (userInput < 5){
//            if (userInput == 1){
//                printArray(intArray);
//            }
//            if(userInput == 2){
//                maxNumber(intArray);
//            }
//            if (userInput == 3){
//                minValue(intArray);
//            }
//            if(userInput == 4){
//                System.out.println("Pls input number for searching: ");
//                int number = scanner.nextInt();
//                searchNumber(number,intArray);
//            }
//
//        }
        System.out.println("Pls input correct number of menu");
        printArray(intArray);
//        maxNumber(intArray);
//        minValue(intArray);
        //
    }

    public static void searchNumber(int number, int[] intArray) {
        for (int elementValue: intArray) {
            if (number == elementValue)
                System.out.println("the ");
        }
    }

    private static void inputMenu(int[] intArray) {
    }

    public static List<Integer> inputArray() {
        List<Integer> intArrayInput = new ArrayList<>();
//        int randomNumber = new SecureRandom().nextInt(10);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input number size of Array: ");
        int araySize = scanner.nextInt();
//        int[] intArrayInput = new int[arayLen];

        for (int i = 0; i < araySize; i++) {
//            System.out.print("Pls input numbers: ");
            intArrayInput.add(new SecureRandom().nextInt(1000));
        }
        printArray(intArrayInput);
        return intArrayInput;
    }

    public static void maxNumber(List<Integer> intArr) {
        int max = 0;
        for (int index = 0; index < intArr.size(); index++) {
            if(max < intArr[index])
                max = intArr[index];
        }
        System.out.println("Max Number of Array: " + max);
    }

    public static void minValue(List<Integer> intArr){
        int min = intArr.get[0];
        for (int index = 1; index < intArr.size(); index++) {
            if(min >intArr[index]) {
                min = intArr[index];
            }
        }
        System.out.println("Min Number of Array: " + min);
    }
    public static void printArray(List<Integer> intArr){
        for (int eleventValue: intArr) {
            System.out.print(eleventValue + " ");
        }

    }


}
