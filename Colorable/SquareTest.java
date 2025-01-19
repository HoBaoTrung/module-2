package Colorable;

import java.util.Random;

public class SquareTest {
    public static void main(String[] args) {
        Random rand = new Random();
        double x = rand.nextDouble();
        System.out.println("Up Size: " + x*100 + "%");
        
        Square square = new Square();
        System.out.println(square);
        square.resize(x);
        System.out.println("After resize: " + square);
        
        square = new Square(5);
        System.out.println(square);
        square.resize(x);
        System.out.println("After resize: " + square);

        square = new Square(3,"puple", false);
        System.out.println(square);
        square.resize(x);
        System.out.println("After resize: " + square);
    }
}
