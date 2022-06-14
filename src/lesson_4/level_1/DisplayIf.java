package lesson_4.level_1;

import java.util.Scanner;

public class DisplayIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter int: ");
        int intNum = scan.nextInt();

        if (intNum > 0) {
            System.out.println("Number is positive.");
        } else if (intNum < 0) {
            System.out.println("Number is negative.");
        } else if (intNum == 0) {
            System.out.println("Number is equal zero.");
        }
    }
}
