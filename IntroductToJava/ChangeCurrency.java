package IntroductToJava;

import java.util.Scanner;

public class ChangeCurrency {
    private static final double EXCHANGE_RATE = 23000;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nCurrency Converter:");
            System.out.println("1. Convert VND to USD");
            System.out.println("2. Convert USD to VND");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    convertVNDToUSD(sc);
                    break;
                case 2:
                    convertUSDToVND(sc);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    private static void convertVNDToUSD(Scanner scanner) {
        System.out.print("Enter amount in VND: ");
        double vnd = scanner.nextDouble();
        if (vnd < 0) {
            System.out.println("Amount cannot be negative.");
            return;
        }
        double usd = vnd / EXCHANGE_RATE;
        System.out.printf("%.0f VND is equivalent to %.2f USD.%n", vnd, usd);
    }

    private static void convertUSDToVND(Scanner scanner) {
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();
        if (usd < 0) {
            System.out.println("Amount cannot be negative.");
            return;
        }
        double vnd = usd * EXCHANGE_RATE;
        System.out.printf("%.2f USD is equivalent to %.0f VND.%n", usd, vnd);
    }
}
