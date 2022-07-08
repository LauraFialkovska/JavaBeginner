package lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService arrServ = new ArrayService();
        int[] myArray1 = {1, 6, 8, 2, 0};

        boolean isReplaced = arrServ.replaceFirst(myArray1, 8, 11);
        System.out.println("\n" + "isReplaced = " + isReplaced);
        System.out.println("myArray = " + Arrays.toString(myArray1));

        isReplaced = arrServ.replaceFirst(myArray1, 3, 11);
        System.out.println("\n" + "isReplaced = " + isReplaced);
        System.out.println("myArray = " + Arrays.toString(myArray1));

        int[] myArray2 = {1, 6, 8, 2, 0, 8, 6};

        int replacedCount = arrServ.replaceAll(myArray2, 6, 777);
        System.out.println("\n" + "replacedCount = " + replacedCount);
        System.out.println("myArray = " + Arrays.toString(myArray2));

        replacedCount = arrServ.replaceAll(myArray2, 3, 777);
        System.out.println("\n" + "replacedCount = " + replacedCount);
        System.out.println("myArray = " + Arrays.toString(myArray2));

        int[] myArray3 = {1, 6, 89, 777};

        int[] reversedArray1 = arrServ.reverseOne(myArray3);
        System.out.println("\n" + "Reversed array #1 " + Arrays.toString(myArray3) + ": " + Arrays.toString(reversedArray1));

        int[] reversedArray2 = arrServ.reverseTwo(myArray3);
        System.out.println("Reversed array #2 " + Arrays.toString(myArray3) + ": " + Arrays.toString(reversedArray2));

        int[] myArray4 = {1, 6, 89, 777, 0};
        System.out.print("Reversed array #3 " + Arrays.toString(myArray4) + ": ");

        arrServ.reverseThree(myArray4);
        System.out.println(Arrays.toString(myArray4));

        int[] myArray5 = {6, 6, 5, 1, 8, 4};
        System.out.print("\n" + "Sort array " + Arrays.toString(myArray5) + ": ");

        arrServ.sort(myArray5);
        // System.out.println(Arrays.toString(myArray5));
    }
}
