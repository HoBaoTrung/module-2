package Array;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        double[][] array = {
                {3, 5, 9},
                {1, 4, 7},
                {8, 2, 6}
        };
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
