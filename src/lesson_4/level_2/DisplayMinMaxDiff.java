package lesson_4.level_2;

import java.util.Scanner;

public class DisplayMinMaxDiff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two int: ");
        int intNum1 = scan.nextInt();
        int intNum2 = scan.nextInt();

        // Display max (num1, num2)
        if (intNum1 > intNum2){
            System.out.println("Max: " + intNum1);
        } else if (intNum1 < intNum2) {
            System.out.println("Max: " + intNum2);
        } else if (intNum1 == intNum2) {
            System.out.println("Max: " + intNum1);
        }

        // Display min (num1, num2)
        if (intNum1 > intNum2){
            System.out.println("Min: " + intNum2);
        } else if (intNum1 < intNum2) {
            System.out.println("Min: " + intNum1);
        } else if (intNum1 == intNum2) {
            System.out.println("Min: " + intNum1);
        }

        if (intNum1 == intNum2){
            System.out.println("Numbers are equals.");
        } else {
            System.out.println("Numbers are different.");
        }
    }
}
