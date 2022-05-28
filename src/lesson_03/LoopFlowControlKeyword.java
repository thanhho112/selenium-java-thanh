package lesson_03;

public class LoopFlowControlKeyword {

    public static void main(String[] args) {

        for (int index = 0; index < 10; index++) {
            if (index ==3 ){
                break; // thoat khoi vong lap for khi index => result: 0 1 2
//                continue; //bo qua index = 3 nhung van tiep tuc vong lap den het array => result = 0 1 2 4 5 6 7 8 9
            }

            System.out.println(index);
        }
    }
}
