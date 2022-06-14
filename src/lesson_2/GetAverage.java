package lesson_2;

import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner scanner = new Scanner(System.in);
        int askNumber1 = scanner.nextInt();
        int askNumber2 = scanner.nextInt();
        int askNumber3 = scanner.nextInt();

        int sum = askNumber1 + askNumber2 + askNumber3;
        double average = (double)sum / 3;

        System.out.print("Average is: " + average);
    }
}
