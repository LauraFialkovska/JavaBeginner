package lesson_6.level_5;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest testRunner = new TicTacToeTest();
        testRunner.checkIsWinPositionForDiagonals();
    }

    int[][] getFilledArray() {
        int[][] array = new int[3][3];

        array[0][0] = 0;
        array[1][1] = 1;
        array[2][2] = 0;
        array[0][2] = 1;
        array[2][0] = 1;

        return array;
    }

    void checkIsWinPositionForDiagonals() {
        TicTacToe game = new TicTacToe();
        int[][] myArray = getFilledArray();

        game.printField(myArray);
        System.out.println();

        // Left diagonal
        boolean expected = false;
        boolean actual = game.isWinPositionForDiagonals(myArray, 0);

        assertIsWin(expected, actual);

        // Right diagonal
        expected = true;
        actual = game.isWinPositionForDiagonals(myArray, 1);

        assertIsWin(expected, actual);
    }

    void assertIsWin(boolean expected, boolean actual) {
        if(expected == actual) {
            System.out.println("[ OK ]");
        } else {
            System.out.println("[ FAIL ]");
        }
    }
}
