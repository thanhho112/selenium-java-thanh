package lesson_03;

public class ForLoopLearning {

    public static void main(String[] args) {

        // requiredRound:
        //
        for (int number = 0; number <10; number++){
            System.out.println(number);
        }//1. number sau khi run xong for = bao nhiu => number = 10

        //
        final int MAX_NUM = 10;
        byte number1 = 0;
        for (;number1 <MAX_NUM;){
            System.out.println(number1);
            number1++;
        }
        //Infinitive loop
        for(;;){   // default value as for(;true;)
            System.out.println("Infinitive loop");
        }

    }
}
