import java.util.Random;
import java.util.Scanner;

// Class to encapsulate the logic of the number guessing game
class GuessGame {
    int targetNumber; // The randomly generated number to be guessed
    int userGuess;    // The user's input guess
    int count = 0;    // Count of attempts taken
    boolean isCorrect = false; // Flag to track if the correct number is guessed

    // Constructor to initialize the game with a random number
    public GuessGame() {
        Random random = new Random();
        targetNumber = random.nextInt(51) + 50; // Random number between 50 and 100
    }

    // Method to take user input for their guess
    public void userInput(Scanner scanner) {
        System.out.print("Enter a number to guess: ");
        userGuess = scanner.nextInt();
    }

    // Method to check if the guessed number is correct and provide hints
    public void checkGuess() {
        if (targetNumber > userGuess) {
            System.out.println("Go for more");
            count += 1;
        } else if (targetNumber < userGuess) {
            System.out.println("Go for less");
            count += 1;
        } else {
            System.out.println("You Guessed the right number");
            isCorrect = true;
        }
    }

    // Method to display the number of attempts taken
    public void displayAttempts() {
        System.out.println("Number of attempts taken: " + count);
    }
}

// Main class for the number guessing game
public class Try{
    public static void main(String[] args) {
        System.out.println("The computer has generated a number between 50 and 100. Try to guess it!");
        GuessGame game = new GuessGame(); // Create an instance of the game logic
        Scanner scanner = new Scanner(System.in);

        // Keep looping until the correct number is guessed
        while (!game.isCorrect) {
            game.userInput(scanner); // Take user's guess
            game.checkGuess();       // Check if the guess is correct and provide hints
        }

        game.displayAttempts(); // Display the number of attempts taken
        scanner.close();        // Close the scanner
    }
}
