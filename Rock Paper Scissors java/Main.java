import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };
        String playersChoice;
        String computerChoice;
        String playAgain = "yes";

        do {

            System.out.print("Pick a move! (rock paper scissors): ");
            playersChoice = scanner.nextLine().toLowerCase();

            if (!playersChoice.equals("rock") &&
                    !playersChoice.equals("paper") &&
                    !playersChoice.equals("scissors")) {
                System.out.println("Enter a valid move!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computers choice: " + computerChoice);

            if (playersChoice.equals(computerChoice)) {
                System.out.println("It is a TIE!");
            } else if ((playersChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playersChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playersChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You WIN!");
            } else {
                System.out.println("You LOSE!");
            }

            System.out.println("PlAY AGAIN? (yes or no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thank you for playing!");

        scanner.close();
    }
}