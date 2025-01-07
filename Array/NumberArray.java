package Array;

import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        int[] array = {1,5,6,8,7,123,-3,1,3,1};
        int index = 1, max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
