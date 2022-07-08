package lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    int[] askForNewArrayLength() {
        Scanner scan = new Scanner(System.in);
        int[] length = new int[2];

        System.out.println("Array[][] length: ");
        length[0] = scan.nextInt();
        length[1] = scan.nextInt();

        return length;
    }

    int[][] create(int length1, int length2) {
        return new int[length1][length2];
    }

    void fillRandomly(int[][] array) {
        Random randValue = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = randValue.nextInt(100);
            }
        }
    }

    void print(int[][] array) {
        System.out.println("\n" + "Array:");

        for (int[] elem : array) {
            System.out.println(Arrays.toString(elem));
        }
    }

    int getTotalSum(int[][] array) {
        int sum = 0;

        /*
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        */

        for (int[] iElem : array) {
            for (int jElem : iElem) {
                sum += jElem;
            }
        }

        return sum;
    }
}
