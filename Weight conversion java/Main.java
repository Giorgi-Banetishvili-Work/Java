import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        double startWeight;
        double endWeight;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter which weight you want to convert: ");
        System.out.println("Enter 1 : for lbs to kgs ");
        System.out.println("Enter 2 : for kgs to lbs ");
        choice = scanner.nextInt();
        System.out.println("Enter the weight: ");
        startWeight = scanner.nextDouble();

        if (choice == 1) {
            endWeight = startWeight * 0.453592;
            System.out.println(endWeight + "kgs");
        } else if (choice == 2) {
            endWeight = startWeight * 2.2;

            System.out.println(endWeight + "lbs");
        } else {
            System.out.println("Enter a valid number for you choice ( 1 or 2 ) or a valid number for your weight");
        }

        scanner.close();
    }
}