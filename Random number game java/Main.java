import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rgn = random.nextInt(0, 101);
        int guess;
        int tries = 0;

        System.out.println("Number Guessing Game!!!");
        System.out.println("Guess a number between 0-100!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            tries++;

            if (guess < rgn) {
                System.out.println("TOO LOW!!!");
            } else if (guess > rgn) {
                System.out.println("TOO HIGH!!!");
            } else {
                System.out.println("Correct! The number was: " + rgn);
                System.out.println("You took " + tries + " attempts!");
            }
        } while (guess != rgn);

        scanner.close();

    }
}