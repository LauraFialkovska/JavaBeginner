package lesson_2;

import java.util.Scanner;

public class AskName {
    public static void main(String[] args) {
        System.out.print("Name: ");
        Scanner scanner = new Scanner(System.in);
        String askName = scanner.next();

        System.out.println("Hello, " + askName + "!");
    }
}
