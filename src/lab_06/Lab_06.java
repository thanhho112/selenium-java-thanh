package lab_06;

import java.util.Scanner;

public class Lab_06 {

    public static void main(String[] args) {

        calculateTime();
        inputPasswordContraint();
        getNumberfromString();
        validateURL();
    }

    private static void calculateTime() {

        /*
        * Given input string: "2hrs and 5 minutes"
        * Please calculate how many minutes in total
        *
        * ===>Still not understand:
        * Solution 1: get number from string and calculate 2 x 60 + 5 = 125 minutes
        * Solution 2:
        * 1. replace space in string
        * 2. find "hrs" tron string => substring tu index 0-> hrs => get number => parseInt => calculate x 60
        * 3. find "minutes" in string => substring=> get number => parseInt
        * 4. Calculate minutes
        * Solution 3
        *   1. split "and" => phan lam 2 doan
        *   2. roi get number & check unit => calculate
        * Solution 4
        *   1. Tim index hr va minutes 
        *   2. loop for timi number before index
        *   3. ParseInt number => calculate
        *  => phat hien diem yeu, neu 2 con so la tieu luon => chua biet cach sua => tam thoi theo de bai
        * */
        String myStr = "2 hrs and 5 minutes";
        int num1 = 0;
        int num2 = 0;
        int total = 0;
    
        for (int i=0; i < myStr.indexOf("hrs"); i++){
            if (Character.isDigit(myStr.charAt(i))){
                num1 = Integer.parseInt(myStr.valueOf(myStr.charAt(i)));
                num1 = num1 * 60;
            }
        }
        
        for (int i=myStr.indexOf("hrs"); i < myStr.indexOf("minutes"); i++){
            if (Character.isDigit(myStr.charAt(i))){
                num2 = Integer.parseInt(myStr.valueOf(myStr.charAt(i)));
            }
        }
        total = num1 + num2;
        System.out.println("Total minutes= " + total);

    }

    private static void inputPasswordContraint() {

        Scanner scanner = new Scanner(System.in);
        String myPassword = "password123";
        int inputTime = 0;

        while (inputTime < 3){
            System.out.print("Input the password: ");
            String inputPassword = scanner.nextLine();
            if (inputPassword.equals(myPassword)){
                System.out.println("Correct password!!!");
                break;
            } else {
                inputTime++;
                String warningMsg = (inputTime == 3) ? "User cannot input over 3 times!!!" : "Incorrect password. please input again!!!";
                System.out.println(warningMsg);
            }
        }
    }

    private static void getNumberfromString() {

        String myStr = "100 minutes";
        String newNumberStr = "";
        for (int i = 0; i < myStr.length(); i++) {
            if (Character.isDigit(myStr.charAt(i))){
//                newNumberStr = newNumberStr + myStr.charAt(i);
                newNumberStr = newNumberStr.concat(myStr.valueOf(myStr.charAt(i)));
            }
        }
        System.out.println("newNumberStr = " + newNumberStr);
    }

    private static void validateURL() {

        String url = "https://google.com";

        // Validation Protocol
        String validateProtocol = url.contains("https:") ? "Protocol is HTTPS" : "Protocol is HTTP";
        System.out.println(validateProtocol);

        // Validation Domain name
        String validateDomainName = url.contains(".com") ? "Domain name is .COM" : "Domain name is .NET";
        System.out.println(validateDomainName);
    }
}
