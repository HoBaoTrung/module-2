package Array;

import java.util.Arrays;
import java.util.Random;

public class Student {
    public static void main(String[] args) {
        float[] point = new float[10];
        Random random = new Random();

        int count = 0;
        for (int i = 0; i < point.length; i++) {
            point[i] = 10 * random.nextFloat();
            if (point[i] >= 5) count++;
        }
        System.out.println("List of mark: " + Arrays.toString(point));
        System.out.print("The number of students passing the exam is " + count);
    }
}
