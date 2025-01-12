package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle2.getArea());
    }
}
