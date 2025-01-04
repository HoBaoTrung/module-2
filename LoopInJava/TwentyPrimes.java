package LoopInJava;

public class TwentyPrimes {
    public static void main(String[] args) {
        int count = 20;
        int number = 2;
        String result = "";
        while (count > 0) {
            if (checkPrime(number)) {
                count--;
                result += number + " ";
            }
            number++;
        }
        System.out.println(result);
    }

    public static boolean checkPrime(int number) {
        int i = 2;
        boolean check = true;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        return check;
    }
}
