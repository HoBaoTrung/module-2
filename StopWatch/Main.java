package StopWatch;

import java.util.Random;

public class Main {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Vị trí phần tử nhỏ nhất
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử hiện tại
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(1000000); // Giá trị ngẫu nhiên từ 0 đến 999,999
        }
        StopWatch stopWatch = new StopWatch();
        System.out.println("Start time: " + stopWatch.getStartTime());
        selectionSort(numbers);
        stopWatch.stop();
        System.out.println("End time: " + stopWatch.getEndTime());
        System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " milliseconds");
    }
}
