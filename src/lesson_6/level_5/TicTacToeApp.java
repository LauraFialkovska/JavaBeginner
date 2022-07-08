package lesson_6.level_5;

public class TicTacToeApp {
    public static void main(String[] args) {

        System.out.println(".:: GAME 'Tic-tac-toe' ::." + "\n");

        TicTacToePrompter prompter = new TicTacToePrompter();
        TicTacToePlayer[] players = new TicTacToePlayer[TicTacToe.maxPlayers];

        System.out.println(".:: SETTINGS ::.");
        System.out.println("\n" + "Name players:");

        for (int i = 0; i < players.length; i++) {
            players[i] = new TicTacToePlayer(prompter.promptPlayerName(i + 1), i);
        }

        TicTacToe game = new TicTacToe(prompter, players);
        game.play();
    }
}
