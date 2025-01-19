package Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(5),
                new Rectangle(4, 6),
                new Circle(3),
                new Square(7)
        };
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            System.out.println("============");
        }
    }
}
