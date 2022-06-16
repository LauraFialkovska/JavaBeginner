package lesson_5.level_4;

import java.util.Scanner;
import java.util.Random;

public class Task_27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Array length: ");
        int arrLen = scan.nextInt();

        if (arrLen <= 0) {
            System.out.println("myErrorMsg: array length should be > 0.");
        } else {
            int[] arr = new int[arrLen];

            Random randNum = new Random();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = randNum.nextInt(100);
            }

            System.out.println("\n" + "Array elements:");

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            int min = arr[0];
            int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.print("\n" + "Min value of array: " + min);
            System.out.print("\n" + "Max value of array: " + max);
            System.out.println("\n\n" + "Even array elements:");

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
