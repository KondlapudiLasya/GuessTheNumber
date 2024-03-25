import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int targetNumber = random.nextInt(max - min + 1) + min;
        
        int attempts = 0;
        int maxAttempts = 10;
        
        System.out.println("Welcome to Guess the Number game!");
        System.out.println("I have chosen a number between " + min + " and " + max + ". Try to guess it!");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
        }
        
        scanner.close();
    }
}