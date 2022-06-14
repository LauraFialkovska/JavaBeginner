package lesson_2;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.print("Integer: ");
        Scanner scanner = new Scanner(System.in);
        int askNumber = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(askNumber + " * " + i + " = " + (askNumber * i));
        }
    }
}
