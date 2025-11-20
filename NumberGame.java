import java.util.Random;
import java.util.Scanner;

class NumberGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int correctNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 7;

    System.out.println("Welcome to number guessing game.");
    System.out.println("Guess the number between 1 to 100");
    System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            attempts++;

            if (guess < correctNumber) {
                System.out.println("Too Low. Try again.");
            } else if (guess > correctNumber) {
                System.out.println("Too High.Try again.");
            } else {
                System.out.println("Correct! You guessed it.");
                System.out.println("Attempts used: " + attempts);
                return;
            }

            System.out.println("Remaining attempts: " + (maxAttempts - attempts));
        }

        System.out.println("Out of attempts!");
        System.out.println("The correct number was: " + correctNumber);
        System.out.println("Thanks for playing.");

        scan.close();
    }
}