package SearchAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUseDeQuy {
    public static boolean binarySearch(int[] array, int left, int right, int value) {
        int mid = (left + right) / 2;
        if (array[mid] == value) {
            return true;
        } else if (left <= right) {
            if (array[mid] < value) {
                return binarySearch(array, mid + 1, right, value);
            } else if (array[mid] > value) {
                return binarySearch(array, left, mid - 1, value);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int search = sc.nextInt();
        Arrays.sort(arr);

        System.out.println(binarySearch(arr, 0, arr.length - 1, search));
    }
}
