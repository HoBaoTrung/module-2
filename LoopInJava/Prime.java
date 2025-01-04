package LoopInJava;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number (-1 to exit): ");
            number = scanner.nextInt();
            if (number < 2) {
                System.out.println(number + " is not a prime");
            } else {
                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check)
                    System.out.println(number + " is a prime");
                else
                    System.out.println(number + " is not a prime");
            }

        } while (number != -1);
    }
}