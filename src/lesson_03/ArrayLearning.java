package lesson_03;

public class ArrayLearning {

    public static void main(String[] args) {

        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];  //cung cap 5 o nho lien tiep cho kieu data int

        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;

        for (int index = 0; index < myIntArray.length; index++) {
            //get dc value tai vi tri index => muc dich su dung cho thay doi value
        }

        //enhence for
        for (int elementValue: myIntArray) {
            System.out.println(elementValue);
            //su dung dong FOR nay chi lay value cua mang do

        }

    }
}
