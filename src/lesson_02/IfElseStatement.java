package lesson_02;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        final int EXPECTED_TIME = 7;
        boolean isOnTime;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls input time for arrival:");
        int arrivalNum = scanner.nextInt();

        System.out.println("Dat xe ra");
        System.out.println("Chay toi quan");

        // == != < >    <--  Toan tu so sanh
        isOnTime = (arrivalNum == EXPECTED_TIME);    // isOnTime = true

//        if(isOnTime){
//            System.out.println("Let's talk");
//        }else {
//            System.out.println("Write a letter");
//        }

        String msg = isOnTime ? "Let's talk" : "Write a letter";

        System.out.println("Ra lay xe");
        System.out.println("Di ve nha");
    }
}
