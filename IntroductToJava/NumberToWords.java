package IntroductToJava;

import java.util.Scanner;

public class NumberToWords {
    // Arrays for basic numbers
    private static final String[] UNITS = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    private static final String[] TEENS = {
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] THOUSANDS = {
            "", "thousand", "million", "billion"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter an integer (or -1 to exit): ");
            long number = scanner.nextLong();

            if (number == -1) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            System.out.println("Number " + number + " in words is: " + convertNumberToWords(number));
        }

        scanner.close();
    }

    private static String convertNumberToWords(long number) {
        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            // trả về chuỗi là "negative" và cách đọc số dương
            return "negative " + convertNumberToWords(-number);
        }

        return convertNumberToWordsRecursive(number).trim();
    }

    private static String convertNumberToWordsRecursive(long number) {
        if (number == 0) {
            return "";
        }

        String result = "";
        int thousandIndex = 0;

        while (number > 0) {
            if (number % 1000 != 0) {
                result = convertChunk((int) (number % 1000)) +
                        (THOUSANDS[thousandIndex].isEmpty() ? "" : " " + THOUSANDS[thousandIndex]) +
                        " " + result;
            }
            number /= 1000;
            thousandIndex++;
        }

        return result.trim();
    }

    private static String convertChunk(int number) {
        String result = "";

        if (number >= 100) {
            result += UNITS[number / 100] + " hundred ";
            number %= 100;
        }

        if (number >= 20) {
            result += TENS[number / 10] + " ";
            number %= 10;
        } else if (number >= 10) {
            result += TEENS[number - 10] + " ";
            return result.trim();
        }

        result += UNITS[number];
        return result.trim();
    }
}
