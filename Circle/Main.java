package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle2.getArea());

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        cylinder.setHeight(10);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
