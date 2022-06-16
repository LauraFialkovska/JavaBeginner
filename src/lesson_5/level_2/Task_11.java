package lesson_5.level_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];

        System.out.println("Int: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
