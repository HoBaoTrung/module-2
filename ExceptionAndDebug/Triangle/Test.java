package ExceptionAndDebug.Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        int side1 = sc.nextInt();
        System.out.println("Enter second side of triangle: ");
        int side2 = sc.nextInt();
        System.out.println("Enter third side of triangle: ");
        int side3 = sc.nextInt();

        try {
            checkTriangle(side1, side2, side3);
        }catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if(side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalTriangleException("Cạnh không được âm");
        }
        if(side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1){
            throw new IllegalTriangleException("Invalid triangle");
        }
        System.out.println("It's a triangle");
    }
}
