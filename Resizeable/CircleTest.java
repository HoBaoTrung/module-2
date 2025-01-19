package Resizeable;

import java.util.Random;

public class CircleTest {
    public static void main(String[] args) {
        Random rand = new Random();
        double x = rand.nextDouble();
        System.out.println("Up Size: " + x*100+ "%");

        Circle circle = new Circle();
        System.out.println(circle);
        circle.resize(x);
        System.out.println("After resize: " + circle.getRadius());

        circle = new Circle(3.5);
        System.out.println(circle);
        circle.resize(x);
        System.out.println("After resize: " + circle.getRadius());

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        circle.resize(x);
        System.out.println("After resize: " + circle.getRadius());
    }
}