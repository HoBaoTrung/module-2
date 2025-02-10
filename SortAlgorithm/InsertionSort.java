package SortAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    static double[] numbers = {1.2, 3.5, 7.8, 9.1, 4.6, 2.3, 5.7, 8.9, 6.4, 0.5};

    public static void main(String[] args) {
        int n = numbers.length, j;
        for (int i = 1; i < n; i++) {
            double x = numbers[i];
            for (j = i; j > 0 && x < numbers[j - 1]; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[j] = x;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
