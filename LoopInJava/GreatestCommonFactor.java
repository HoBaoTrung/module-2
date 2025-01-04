package LoopInJava;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        int result = gcd(a, b);
        if (result == 0){System.out.println("No greatest common factor");}
        else System.out.println("Result: " + result);
    }

    public static int gcd(int a, int b) {
        // Sử dụng thuật toán Euclid
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            System.out.printf("%d^%d = %d\n", a, b, temp);
        }
        return a;
    }
}
