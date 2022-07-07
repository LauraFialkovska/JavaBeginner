package lesson_6.level_4;

import java.util.Arrays;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray array = new TwoDimensionalArray();

        int[] arrLength = array.askForNewArrayLength();
        int[][] myArray = array.create(arrLength[0], arrLength[1]);
        // array.print(myArray);

        array.fillRandomly(myArray);
        array.print(myArray);

        int totalSum = array.getTotalSum(myArray);
        System.out.println("\n" + "Total sum: " + totalSum);
    }
}
