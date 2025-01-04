package LoopInJava;

import java.util.Scanner;

public class Types {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: rectangle(); break;
                case 2: square_triangle(); break;
                case 3: isoscelesTriangle(); break;
                case 0: System.out.println("Goodbye!"); System.exit(0);;
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static void rectangle() {
        int col = 7, row = 3;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void square_triangle() {
        int n = 5;
        String triangle1 ="", triangle2 ="", triangle3 ="", triangle4 = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                triangle1 += "* ";
            }
            triangle1 += "\n";

            for (int j = n - i + 1; j > 0; j--) {
                triangle2 += "* ";
            }
            triangle2 += "\n";

            for (int j = n; j > 0; j--) {
                if (j > i) triangle3 += "  ";
                else triangle3 += " *";
            }
            triangle3 += "\n";

            for (int j = n; j > 0; j--) {
                if (j >= i) triangle4 += "* ";
            }
            triangle4 += "\n";
        }
        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println(triangle3);
        System.out.println(triangle4);
    }
    public static void isoscelesTriangle() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng ở bên trái
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // In các dấu * tạo thành hàng
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Xuống dòng sau mỗi hàng
            System.out.println();
        }
    }
}
