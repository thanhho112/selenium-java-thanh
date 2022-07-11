package lession_13;

public class Calculation {

    public int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {

       System.out.println(new Calculation().divide(4, 2));
       try {
            System.out.println(new Calculation().divide(4, 0));
        } catch (Exception e){
           e.printStackTrace();
        }
        System.out.println("see you again");
    }
}
