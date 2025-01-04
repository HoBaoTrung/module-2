package LoopInJava;

public class PrimeFrom1To100 {
    public static void main(String[] args) {
        String result = "";
        for(int i=2; i<=100; i++){
            if(checkPrime(i)){
                result += i + " ";
            }
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
