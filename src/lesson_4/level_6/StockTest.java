package lesson_4.level_6;

public class StockTest {
    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.maxTest();
    }

    void maxTest() {
        Stock stock1 = new Stock("GOOG", 10);

        stock1.updatePrice(9);
        int expected = 10;
        int actual = stock1.maxPrice;

        assertIsEqual(expected, actual);

        Stock stock2 = new Stock("GOOG", 10);

        stock2.updatePrice(12);
        stock2.updatePrice(5);
        stock2.updatePrice(7);
        stock2.updatePrice(99);
        stock2.updatePrice(77);

        expected = 99;
        actual = stock2.maxPrice;

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
