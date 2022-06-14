package lesson_4.level_1;

import java.util.Scanner;

public class DisplayEvenOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter int: ");
        int intNum = scan.nextInt();

        if (intNum % 2 == 0){
            System.out.println("Even: " + intNum);
        } else {
            System.out.println("Not even: " + intNum);
        }
    }
}
