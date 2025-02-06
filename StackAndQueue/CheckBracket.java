package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {

    public static boolean checkBracket(String input) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (stack.peek() == '(') {
                        if (c == ')') {
                            stack.pop();
                            continue;
                        }
                    } else if (stack.peek() == '{') {
                        if (c == '}') {
                            stack.pop();
                            continue;
                        }
                    } else if (stack.peek() == '[') {
                        if (c == ']') {
                            stack.pop();
                            continue;
                        }
                    }
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an string: ");
        String s = sc.nextLine();
        System.out.println(checkBracket(s));
    }
}
