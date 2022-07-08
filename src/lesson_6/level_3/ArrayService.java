package lesson_6.level_3;

import java.util.Arrays;

public class ArrayService {

    boolean replaceFirst(int[] array, int numberToReplace, int replaceWithNumber) {
        System.out.println("\n" + "Processed elements:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

            if (array[i] == numberToReplace) {
                array[i] = replaceWithNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] array, int numberToReplace, int replaceWithNumber) {
        System.out.println("\n" + "Processed elements:");
        int replacedCount = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

            if (array[i] == numberToReplace) {
                array[i] = replaceWithNumber;
                replacedCount += 1;
            }
        }
        return replacedCount;
    }

    // Primitive
    int[] reverseOne(int[] array) {
        int arrLength = array.length;
        int reverseInd = 0;
        int[] reversedArray = new int[arrLength];

        for (int i = arrLength - 1; i >= 0; i--) {
            reversedArray[reverseInd] = array[i];
            reverseInd += 1;
        }

        return reversedArray;
    }

    // Better
    int[] reverseTwo(int[] array) {
        int arrLength = array.length;
        int[] reversedArray = new int[arrLength];
        int reverseInd = arrLength - 1;

        for (int i = 0; i < arrLength; i++) {
            reversedArray[reverseInd - i] = array[i];

            // reversedArray[reverseInd] = array[i];
            // reverseInd -= 1;
        }

        return reversedArray;
    }

    // Advanced
    void reverseThree(int[] array) {
        int arrLength = array.length;
        int reverseInd = arrLength - 1;
        int dividedArrLength = arrLength / 2;

        for (int i = 0; i < dividedArrLength; i++) {
            int reverseValue = array[reverseInd - i];

            array[reverseInd - i] = array[i];
            array[i] = reverseValue;
        }
    }

    // Sort int[] ASC
    void sort(int[] array) {
        int arrLength = array.length;

        System.out.println();
        for (int i = 0; i < arrLength; i++) {

            System.out.println("Array state #" + (i + 1) + ": " + Arrays.toString(array));

            for (int j = i + 1; j < arrLength; j++) {
                if (array[i] > array[j]) {
                    System.out.println("   Swapped: " + array[i] + " and " + array[j]);

                    int tmpValue = array[i];
                    array[i] = array[j];
                    array[j] = tmpValue;

                    System.out.println("      Array = " + Arrays.toString(array));
                }
            }
        }
    }
}
