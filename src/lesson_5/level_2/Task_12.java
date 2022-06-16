package lesson_5.level_2;

import java.util.Random;

public class Task_12 {
    public static void main(String[] args) {

        Random randNum = new Random();
        int[] arr = new int[3];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randNum.nextInt(100);
            sum += arr[i];
        }

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " // +2 => " + (arr[i] + 2));
        }

        System.out.println("");
        System.out.print("Sum of array elements: " + sum);
        System.out.println("");
        System.out.print("Avr of array elements: " + (double) sum / arr.length);

    }
}
