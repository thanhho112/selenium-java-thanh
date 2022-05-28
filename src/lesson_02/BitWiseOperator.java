package lesson_02;

public class BitWiseOperator {
    public static void main(String[] args) {

        // method1 = false => print method1 => ket thuc
        // method1 = true => print method1 va method2 => ket thuc
        if (method1() && method2()){
            System.out.println("\tInside the function");
        }

        //Evaluate
        if(method1() || method2()){
            System.out.println("\t ");
        }

    }

    private static boolean method1() {
        System.out.println("method1");
        return true;
    }
    private static boolean method2() {
        System.out.println("method2");
        return false;
    }

}
