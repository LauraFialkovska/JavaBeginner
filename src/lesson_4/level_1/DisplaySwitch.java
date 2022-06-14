package lesson_4.level_1;

import java.util.Scanner;

public class DisplaySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter int (1 - 7): ");
        int intNum = scan.nextInt();

        switch (intNum){
            case 1:
                System.out.println("Mo");
                break;
            case 2:
                System.out.println("Tu");
                break;
            case 3:
                System.out.println("We");
                break;
            case 4:
                System.out.println("Th");
                break;
            case 5:
                System.out.println("Fr");
                break;
            case 6:
                System.out.println("Sa");
                break;
            case 7:
                System.out.println("Su");
                break;
        }
    }
}
