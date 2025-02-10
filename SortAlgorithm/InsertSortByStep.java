package SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertSortByStep(list);
    }

    public static void insertSortByStep(int[] list) {
        int n = list.length, j;
        for (int i = 1; i < n; i++) {
            int x = list[i];
            for (j = i; j > 0 && x < list[j - 1]; j--) {
                System.out.println("Swap " + list[j] + " with " + list[j - 1]);
                list[j] = list[j - 1];
            }
            list[j] = x;
            System.out.print("List after the  " + i + "' sort: ");
            System.out.println(Arrays.toString(list));
        }

    }
}
