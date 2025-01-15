package Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập màu sắc của tam giác
        System.out.print("Enter the color of the triangle: ");
        String color = scanner.nextLine();

        // Nhập ba cạnh của tam giác
        System.out.print("Enter the first side of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double side3 = scanner.nextDouble();

        if (isValidTriangle(side1, side2, side3)) {
            // Tạo đối tượng Triangle với ba cạnh và màu sắc đã nhập
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);

            // Hiển thị thông tin của tam giác
            System.out.println("\n" + triangle.toString());
        } else {
            System.out.println("The input sides do not form a valid triangle.");
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}

