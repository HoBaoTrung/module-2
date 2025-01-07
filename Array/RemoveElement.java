package Array;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,8,9,10};
        int n = 3, index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Điền `0` vào các vị trí còn lại
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println("Mảng sau khi xóa phần tử " + n + ": " + Arrays.toString(arr));


    }
}
