package lesson_5.level_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Array {
    int askForNewArrayLength() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = scan.nextInt();

        return length;
    }

    int[] create(int length) {
        int[] array = new int[length];

        return array;
    }

    void fillRandomly(int[] array) {
        Random randNum = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = randNum.nextInt(100);
        }
    }

    void findMax(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.print("\n" + "Max value of array: " + max);
    }

    void print(int[] array) {
        System.out.print("\n" + "Array elements: " + Arrays.toString(array));
    }
}
