package Array;

import java.util.Random;

public class SumOfMainDiagonal {
    public static void main(String[] args) {
        int rows = 5; // Số hàng
        int cols = 5; // Số cột
        double[][] array = new double[rows][cols];
        Random random = new Random();

        // Gán giá trị ngẫu nhiên từ 0 đến 10 cho từng phần tử trong mảng 2 chiều
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 10 * random.nextDouble(); // nextDouble() trả giá trị từ 0.0 đến 1.0
            }
        }

        double sum = 0;
        if(rows % 2 != 0){
            sum += array[rows/2][cols/2];
        }
        for (int i = 0; i < rows/2; i++) {
            System.out.println(array[i][i] + " " + array[rows - 1 - i][rows - 1 - i]);
            sum += array[i][i];
            sum += array[rows - 1 - i][rows - 1 - i];
        }

        for (double[] row : array) {
            for (double value : row) {
                System.out.printf("%f   ", value);
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
