package lesson_03;

import java.util.Scanner;

public class WhileLoopLearning {

    public static void main(String[] args) {
        boolean isSthStillTrue = true;

        while (isSthStillTrue){
            System.out.println("======Game Menu =======");;
            System.out.println("1. Generate a random number(less than 1000");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select option: ");
            int option = scanner.nextInt();

            if( option ==0){
                isSthStillTrue = false;
            } else if (option == 1) {
                System.out.println("nhap tam bay - cu choi tiep di");
                //break;
                continue;
            }else {
                System.out.println("nhap tam bay - cu choi tiep didddddd");
            }
        }
        System.out.println("Buon qua - ban hok choi nua roi");
    }
}
