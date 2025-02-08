package SortAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        int count = 0; // đếm số lần chạy vòng lặp ngoài
        boolean needNextPass = true;
        for (int i = 0; i < list.length - 1 && needNextPass; i++) {
            needNextPass = false;
            count++;
            for (int j = list.length - 1; j > i; j--) {
                if (list[j - 1] > list[j]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                    needNextPass = true;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(list));
    }
}
