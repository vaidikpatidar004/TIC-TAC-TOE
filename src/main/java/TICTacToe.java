import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        // Game State Variables
        char player1Symbol, player2Symbol;
        char currentPlayer;

        // 1. Random Number Generation (Toss)
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        // 2. Conditional Logic for assigning symbols & first turn
        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1Symbol;

            System.out.println("Player 1 wins the toss!");
            System.out.println("Player 1 is X and will start first.");
            System.out.println("Player 2 is O.");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2Symbol;

            System.out.println("Player 2 wins the toss!");
            System.out.println("Player 2 is X and will start first.");
            System.out.println("Player 1 is O.");
        }

        // 3. Store & Display Current Player Info
        System.out.println("\nCurrent Turn: " + currentPlayer);
    }
}
