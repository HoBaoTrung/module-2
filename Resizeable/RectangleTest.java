package Resizeable;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Random rand = new Random();
        double x = rand.nextDouble();
        System.out.println("Up Size: " + x*100 + "%");

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle.resize(x);
        System.out.println("After resize: " + rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle.resize(x);
        System.out.println("After resize: " + rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        rectangle.resize(x);
        System.out.println("After resize: " + rectangle);
        System.out.println(rectangle.getArea());
    }
}
