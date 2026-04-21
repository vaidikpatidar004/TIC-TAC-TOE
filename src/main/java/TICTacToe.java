import java.util.Scanner;

public class TICTacToe {

    // Method to get user input (Separation of Concerns)
    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");

        // 1. User Input Handling
        int slot = sc.nextInt();

        // 2. Return the slot value to game logic
        return slot;
    }

    public static void main(String[] args) {

        // Call method to get input
        int chosenSlot = getUserSlot();

        // Display entered value (for testing)
        System.out.println("You selected slot: " + chosenSlot);
    }
}
