package lesson_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls input value: ");
        int clientAge = scanner.nextInt();               // Nhap value from ban phim

        // <18 || 18 - 55 || >55
        if (clientAge < 18){
            System.out.println("Khong ban");
        } else if (clientAge <=55) {
            System.out.println("Unlimited");
        }else {
            System.out.println("2 chai");
        }

        //Nested if

    }
}
