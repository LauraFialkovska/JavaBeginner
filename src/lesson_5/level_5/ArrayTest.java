package lesson_5.level_5;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayTest testRunner = new ArrayTest();
        testRunner.shouldCreateArray();
    }

    void shouldCreateArray() {
        Array array = new Array();

        int ArrayLength = array.askForNewArrayLength();
        int[] myArray = array.create(ArrayLength);

        int expected = ArrayLength;
        int actual = myArray.length;

        assertIsEqual(expected, actual);
    }

    void assertIsEqual(int expected, int actual) {
        if (expected == actual) {
            System.out.println("[ OK ]");
        } else {
            System.out.println("[ FAIL ]");
        }
    }
}
