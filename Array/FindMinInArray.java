package Array;

import java.util.Arrays;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {10,-2,30,45,15,6,7,8,9};
        System.out.println(Arrays.stream(arr).min().getAsInt());
    }
}
