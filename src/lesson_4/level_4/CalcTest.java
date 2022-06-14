package lesson_4.level_4;

public class CalcTest {
    public static void main(String[] args) {
        CalcTest testRunner = new CalcTest();

        testRunner.sumTest();
        testRunner.isEvenTest();
    }

    void sumTest() {
        Calc calc = new Calc();

        int expected = 8;
        int actual = calc.sum(2,6);

        assertIsEqual(expected, actual);
    }

    void isEvenTest() {
        Calc calc = new Calc();

        // boolean expected = true;
        boolean actual = calc.isEven(2);

        assertIsBoolean(actual);
    }

    void assertIsEqual(int expected, int actual) {
        if (expected == actual) {
            System.out.println("[ OK ]");
        } else {
            System.out.println("[ FAIL ]");
        }
    }

    void assertIsBoolean(boolean status) {
        if (status) {
            System.out.println("[ OK ]");
        } else {
            System.out.println("[ FAIL ]");
        }
    }
}
