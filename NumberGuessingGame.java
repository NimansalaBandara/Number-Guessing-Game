import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create scanner and random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Define range and generate random number
        int range = 100;
        int randomNumber = random.nextInt(range) + 1;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and " + range);
        System.out.println("Can you guess what it is?");

        // Keep asking until the user guesses correctly
        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        }
        scanner.close();
    }
}
