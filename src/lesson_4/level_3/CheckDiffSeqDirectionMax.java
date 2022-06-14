package lesson_4.level_3;

import java.util.Scanner;

public class CheckDiffSeqDirectionMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three int: ");
        int intNum1 = scan.nextInt();
        int intNum2 = scan.nextInt();
        int intNum3 = scan.nextInt();

        if (intNum1 == intNum2 && intNum1 == intNum3) {
            System.out.println("All numbers are equal");
        } else if (intNum1 != intNum2 && intNum1 != intNum3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        // What is "1 1 2" - increasing or neither?
        if (intNum1 > intNum2 && intNum2 > intNum3) {
            System.out.println("Sequence: decreasing");
        } else if (intNum1 < intNum2 && intNum2 < intNum3) {
            System.out.println("Sequence: increasing");
        } else {
            System.out.println("Sequence: neither");
        }

        if (intNum1 > intNum2 && intNum1 > intNum3) {
            System.out.println("Max: " + intNum1);
        } else if (intNum2 > intNum1 && intNum2 > intNum3) {
            System.out.println("Max: " + intNum2);
        } else {
            System.out.println("Max: " + intNum3);
        }
    }
}
