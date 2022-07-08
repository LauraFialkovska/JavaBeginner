package lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest testRunner = new ArrayServiceTest();

        testRunner.checkIfReplacedFirst();
        testRunner.checkIfNotReplacedFirst();
        testRunner.checkIfReversed();
    }

    // Tests

    void checkIfReplacedFirst() {
        int[] myArray = {1, 6, 8, 2, 0};
        int numberToReplace = 8;
        int replaceWithNumber = 10;

        ArrayService arrServ = new ArrayService();

        boolean expected = true;
        boolean actual = arrServ.replaceFirst(myArray, numberToReplace, replaceWithNumber);

        assertIsReplaced(expected, actual);
    }

    void checkIfNotReplacedFirst() {
        int[] myArray = {1, 6, 8, 2, 0};
        int numberToReplace = 3;
        int replaceWithNumber = 10;

        ArrayService arrServ = new ArrayService();

        boolean expected = false;
        boolean actual = arrServ.replaceFirst(myArray, numberToReplace, replaceWithNumber);

        assertIsReplaced(expected, actual);
    }

    void checkIfReversed() {
        int[] myArray = {7, 1, 66, 888, 22, 0};
        System.out.println("\n" + "Original array = " + Arrays.toString(myArray));

        ArrayService arrServ = new ArrayService();

        int[] expected = {0, 22, 888, 66, 1};
        System.out.println("Reversed (expected) array = " + Arrays.toString(expected));

        arrServ.reverseThree(myArray);
        int[] actual = myArray;
        System.out.println("Reversed (actual) array = " + Arrays.toString(actual));

        assertIsReversed(expected, actual);
    }

    // Check

    void assertIsReplaced(boolean expected, boolean actual) {
        if(expected == actual) {
            System.out.println("[ OK ]");
        } else {
            System.out.println("[ FAIL ]");
        }
    }

    void assertIsReversed(int[] expectedArray, int[] actualArray) {
        boolean status = true;

        if(expectedArray.length != actualArray.length) {
            status = false;
        } else {
            for (int i = 0; i < actualArray.length; i++) {
                if(expectedArray[i] != actualArray[i]) {
                    status = false;
                    break;
                }
            }
        }

        if(status) {
            System.out.println("[ OK ]");
        } else {
            System.out.println("[ FAIL ]");
        }
    }
}
