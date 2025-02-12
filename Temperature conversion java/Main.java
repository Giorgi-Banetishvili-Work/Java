import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double startTemp;
        double lastTemp;
        String measuremnt;

        System.out.print("Enter the temperature: ");
        startTemp = scanner.nextDouble();

        System.out.print("Convert to celsius or fahrenheit? ( C or F )");
        measuremnt = scanner.next().toUpperCase();

        lastTemp = (measuremnt.equals("C")) ? (startTemp - 32) * 5 / 9 : (startTemp * 9 / 5) + 32;

        System.out.printf("%.1f° %s", lastTemp, measuremnt);

        scanner.close();

    }
}