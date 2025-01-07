package Array;

import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int index = 2, n = 2025;
        if(index < 0 || index >= numbers.length){
            System.out.println("Index out of bounds");
        }else {
            for(int i = numbers.length - 1; i > index; i--){
                numbers[i] = numbers[i - 1];
            }
            numbers[index] = n;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
