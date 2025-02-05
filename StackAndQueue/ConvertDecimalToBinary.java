package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {

    public static String convertDecimalToBinary(int num) {
        String binary = "";
        Stack<String> stack = new Stack<>();
        while (num != 0) {
            stack.push(num % 2 + "");
            num = num / 2;
        }
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Result: " + convertDecimalToBinary(num));
    }
}
