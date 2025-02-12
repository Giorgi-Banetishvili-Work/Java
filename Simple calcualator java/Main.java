import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char operator = '+';
        double numOne = 0;
        double numTwo = 0;
        double result = 0;
        boolean valid = true;

        System.out.println("This is a simple calcualtor!");
        System.out.print("Enter the first number: ");
        numOne = scanner.nextDouble();
        System.out.print("Enter the operator ( +, -, *, / ): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        numTwo = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = numOne + numTwo;
            case '-' -> result = numOne - numTwo;
            case '*' -> result = numOne * numTwo;
            case '/' -> {
                if (numTwo == 0) {
                    System.out.println("You cant divide using zero!");
                    valid = false;
                } else {
                    result = numOne / numTwo;
                }
            }
            default -> {
                System.out.println("Enter a valid operator!");
                valid = false;
            }
        }
        if (valid) {
            System.out.println(result);
        }

        scanner.close();
    }
}