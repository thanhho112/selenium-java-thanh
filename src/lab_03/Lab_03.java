package lab_03;

public class Lab_03 {

    public static void main(String[] args) {

        int[] intArr = {1,3,5,2,4};
        int[] firstArray = {1,12,16,28,34};
        int[] secondArray = {1,13,16,27,99};

        System.out.print("Action on Array:");
        printArray(intArr);
        System.out.println();
        countOddEvenNumber(intArr);
        minValue(intArr);
        maxNumber(intArr);
        System.out.println("Array is increased sort as: ");
        sortArrayIncrease(intArr);
        System.out.println();
        System.out.println("Merge and sort 2 Arrays: ");
        mergeAndSortArrays(firstArray,secondArray);

    }

    public static void  countOddEvenNumber(int[] intArr){
        int countOddNumber = 0;
        int countEvenNumber = 0;
        for (int eleventValue: intArr) {
            if(eleventValue % 2 == 0){
                countEvenNumber = countEvenNumber + 1;
            }else{
                countOddNumber = countOddNumber + 1;
            }
        }
        System.out.println("countEvenNumber: " + countEvenNumber);
        System.out.println("CountOddNumber: " + countOddNumber);
    }

    private static void maxNumber(int[] intArr) {
        int max = 0;
        for (int index = 0; index < intArr.length; index++) {
            if(max < intArr[index])
                max = intArr[index];
        }
        System.out.println("Max Number of Array: " + max);
    }

    public static void minValue(int[] intArr){
        int min = intArr[0];
        for (int index = 1; index < intArr.length; index++) {
                if(min > intArr[index]) {
                    min = intArr[index];
                }
            }
        System.out.println("Min Number of Array: " + min);
    }

    public static void sortArrayIncrease(int[] intArr){
        for(int i = 0; i < intArr.length -1 ; i++){
            int idmin = i;
            for(int j = i + 1; j < intArr.length ; j++){
                if(intArr[j] < intArr[idmin])
                    idmin = j;
            }
            // swap
            int t = intArr[i];
            intArr[i] = intArr[idmin];
            intArr[idmin] = t;
        }

        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
    }

    public static void mergeAndSortArrays(int[] firstArray, int[] secondArray){
        int faLen = firstArray.length;
        int saLen = secondArray.length;
        int[] mergeArr = new int[faLen + saLen];

        for (int i = 0; i < firstArray.length; i++) {
            mergeArr[i] = firstArray[i];
        }

        int tempIndex = firstArray.length;
        for (int j = 0; j < secondArray.length; j++) {
            mergeArr[tempIndex] = secondArray[j];
            tempIndex++;
        }
        sortArrayIncrease(mergeArr);
    }

    public static void printArray(int[] intArr){
        for (int eleventValue: intArr) {
            System.out.print(eleventValue + " ");
        }
    }
}
