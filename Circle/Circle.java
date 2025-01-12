package Circle;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        radius = 1;
        color = "red";
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
