package lesson_02;

public class OperatorLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        int total = myNum1 + myNum2;
        int multiple = myNum1 * myNum2;

        //Print result
        System.out.println("Total = " + total);
        System.out.println("Multiple = " + multiple);
        /*
        *    Using the format: %..
        *  %f:
        *  %d:
        *  %s:
        *  %b:
        * */
//        System.out.println("%d / %d = %d",5,2,5/2);
        totalF(myNum1,myNum2);
    }

    public static void totalF(int num1, int num2){
        int total = num1 + num2;
        System.out.println("Total = " + total);
    }
}
