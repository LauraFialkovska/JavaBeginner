package lesson_6.level_5;

import java.util.Arrays;

public class TicTacToe {
    static int maxPlayers = 2;
    static int minFieldSize = 3;
    int[][] field;

    TicTacToePrompter prompter;
    TicTacToePlayer[] players;

    public TicTacToe() {
    }

    public TicTacToe(TicTacToePrompter prompter, TicTacToePlayer[] players) {
        this.prompter = prompter;
        this.players = players;
    }

    void play() {
        int fieldSize = prompter.promptFieldSize();
        createField(fieldSize);

        System.out.println("\n" + ".:: START ::.");
        printField(this.field);

        while (true) {
            boolean isBlankFieldItem = true;
            boolean isWinPosition = false;

            for (int i = 0; i < maxPlayers; i++) {
                int[] fieldItem = prompter.promptFieldItem(players[i], fieldSize);

                while (this.field[fieldItem[0]][fieldItem[1]] != -1) {
                    System.out.println("\n" + "myErrorMsg: field item is already occupied!");
                    fieldItem = prompter.promptFieldItem(players[i], fieldSize);
                }

                setFieldValue(this.field,
                              fieldItem[0],
                              fieldItem[1],
                              players[i].crossOrZero);

                isWinPosition = isWinPosition(this.field, players[i].crossOrZero);

                // Out from FOR loop
                if (isWinPosition) {
                    System.out.println("\n" + "myWarningMsg: " + players[i].name + ", you are winner!");
                    break;
                }

                isBlankFieldItem = isBlankFieldItem(this.field);

                if (!isBlankFieldItem) {
                    System.out.println("\n" + "myWarningMsg: the game ended in a draw!");
                    break;
                }
            }

            // Out from WHILE loop
            if (isWinPosition || !isBlankFieldItem) {
                break;
            }
        }
    }

    void createField(int size) {
        this.field = new int[size][size];
        int emptyState = -1;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = emptyState;
            }
        }
    }

    void printField(int[][] field) {
        System.out.println("\n" + ".:: Game state ::.");

        for (int[] elem : field) {
            System.out.println(Arrays.toString(elem));
        }
    }

    void setFieldValue(int[][] field, int row, int column, int crossOrZero) {
        field[row][column] = crossOrZero;
        printField(field);
    }

    boolean isBlankFieldItem(int[][] field) {
        boolean status = false;

        for (int[] iElem : field) {
            for (int jElem : iElem) {
                if (jElem == -1) {
                    status = true;
                    break;
                }
            }

            if (status) {
                break;
            }
        }

        return status;
    }

    boolean isCompleteMatch(int[] array, int crossOrZero){
        for (int value : array) {
            if (value != crossOrZero) {
                return false;
            }
        }

        return true;
    }

    boolean isWinPositionForHorizontals(int[][] field, int crossOrZero) {
        for (int[] horizontal : field) {
            boolean isCompleteMatch = isCompleteMatch(horizontal, crossOrZero);

            if (isCompleteMatch) {
                return true;
            }
        }

        return false;
    }

    boolean isWinPositionForVerticals(int[][] field, int crossOrZero) {
        int fieldSize = field.length;
        int[] vertical = new int[fieldSize];

        for (int column = 0; column < fieldSize; column++) {
            for (int row = 0; row < fieldSize; row++) {
                vertical[row] = field[row][column];
            }

            boolean isCompleteMatch = isCompleteMatch(vertical, crossOrZero);

            if (isCompleteMatch) {
                return true;
            }
        }

        return false;
    }

    boolean isWinPositionForDiagonals(int[][] field, int crossOrZero) {
        int fieldSize = field.length;
        int[] leftDiagonal = new int[fieldSize];
        int[] rightDiagonal = new int[fieldSize];
        int[][] diagonals = {leftDiagonal, rightDiagonal};

        int leftDiagonalCounter = 0;
        int rightDiagonalCounter = fieldSize - 1;

        for (int i = 0; i < fieldSize; i++) {
            leftDiagonal[i] = field[i][leftDiagonalCounter];
            leftDiagonalCounter += 1;

            rightDiagonal[i] = field[i][rightDiagonalCounter];
            rightDiagonalCounter -= 1;
        }

        for (int[] diagonal : diagonals) {
            boolean isCompleteMatch = isCompleteMatch(diagonal, crossOrZero);

            if (isCompleteMatch) {
                return true;
            }
        }

        return false;
    }

    boolean isWinPosition(int[][] field, int crossOrZero) {
        boolean isWinPositionForHorizontals = isWinPositionForHorizontals(field, crossOrZero);
        boolean isWinPositionForVerticals = isWinPositionForVerticals(field, crossOrZero);
        boolean isWinPositionForDiagonals = isWinPositionForDiagonals(field, crossOrZero);

        boolean[] statuses = {isWinPositionForHorizontals,
                              isWinPositionForVerticals,
                              isWinPositionForDiagonals};

        for (boolean status : statuses) {
            if (status) {
                return true;
            }
        }

        return false;
    }
}
