import java.util.Scanner;
import java.util.Random;

public class GuesserGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;  // Minimum number
        int upperBound = 100; // Maximum number
        int numGuesses = 0;  // Number of guesses
        
        int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound; // Generate secret number
        
        System.out.println("Welcome to the Guesser Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            numGuesses++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You've guessed the number in " + numGuesses + " guesses.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}