package lesson_6.level_5;

import java.util.Scanner;

public class TicTacToePrompter {
    String promptPlayerName(int counter){
        Scanner scan = new Scanner(System.in);

        System.out.print("Player #" + counter + ": ");
        return scan.nextLine();
    }

    int promptFieldSize() {
        Scanner scan = new Scanner(System.in);
        int minSize = TicTacToe.minFieldSize;

        System.out.print("\n" + "Set field size: ");
        int size = scan.nextInt();

        while (size < minSize) {
            System.out.println("\n" + "myErrorMsg: min field size is " + minSize + ".");
            System.out.print("Field size: ");
            size = scan.nextInt();
        }

        return size;
    }

    int[] promptFieldItem(TicTacToePlayer player, int fieldSize) {
        Scanner scan = new Scanner(System.in);
        int[] fieldItem = new int[2];

        System.out.println("\n" + player.name + ", select field item:");
        System.out.print("Row: ");
        fieldItem[0] = scan.nextInt();

        while (fieldItem[0] >= fieldSize) {
            System.out.println("\n" + "myErrorMsg: row should be < " + fieldSize + ".");
            System.out.print("Row: ");
            fieldItem[0] = scan.nextInt();
        }

        System.out.print("Column: ");
        fieldItem[1] = scan.nextInt();

        while (fieldItem[1] >= fieldSize) {
            System.out.println("\n" + "myErrorMsg: column should be < " + fieldSize + ".");
            System.out.print("Column: ");
            fieldItem[1] = scan.nextInt();
        }

        return fieldItem;
    }
}
