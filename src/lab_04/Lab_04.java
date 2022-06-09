package lab_04;

import java.security.SecureRandom;
import java.util.*;

public class Lab_04 {
    public static void main(String[] args) {

        List<Integer> intArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        intArray = inputArray();
        inputMenu(intArray);
    }
    private static void inputMenu(List<Integer> intArray) {

        Scanner scanner = new Scanner(System.in);
        boolean isMenuCorrect = true;

        while (isMenuCorrect) {
            System.out.println("====MENU======");
            System.out.print("1. Print all numbers\n" +
                    "2. Print maximum value\n" +
                    "3. Print minimum value\n" +
                    "4. Search number\n");

            System.out.print("Pls input menu number: ");
            int number = scanner.nextInt();
            if (number == 1){
                printArray(intArray);

            } else if (number == 2){
                maxNumber(intArray);

            } else if (number == 3){
                minValue(intArray);

            } else if (number == 4){
                searchNumber(intArray);

            } else {
                System.out.println("Incorrect menu");
                isMenuCorrect = false;
            }
        }
        System.out.println("Thank you for your choice");
    }
    public static List<Integer> inputArray() {
        List<Integer> intArrayInput = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input number size of Array: ");
        int araySize = scanner.nextInt();

        for (int i = 0; i < araySize; i++) {
            intArrayInput.add(new SecureRandom().nextInt(1000));
        }
        printArray(intArrayInput);
        return intArrayInput;
    }
    public static void maxNumber(List<Integer> intArr) {
        int max = intArr.get(0);
        for (int index = 0; index < intArr.size(); index++) {
            if(max < intArr.get(index))
                max = intArr.get(index);
        }
        System.out.println("Max Number of Array: " + max);
    }
    public static void minValue(List<Integer> intArr){
        int min = intArr.get(0);
        for (int index = 1; index < intArr.size(); index++) {
            if(min >intArr.get(index)) {
                min = intArr.get(index);
            }
        }
        System.out.println("Min Number of Array: " + min);
    }
    public static void searchNumber(List<Integer> intArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input search number: ");
        int number = scanner.nextInt();

        for (int index = 0; index < intArray.size(); index++) {
            if (number == intArray.get(index)){
                System.out.println("Found number= :" + number +" at index = " + index);
            } else {
                System.out.println("The number is not existed in Array");
            }
        }
    }
    public static void printArray(List<Integer> intArr){
        for (int eleventValue: intArr) {
            System.out.print(eleventValue + " ");
        }
    }
}
