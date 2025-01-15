package Triangle;

public class Triangle extends Shape {
    private double side1, side2, side3;

    // Phương thức khởi tạo mặc định
    public Triangle() {
        this(1.0, 1.0, 1.0); // Độ dài ba cạnh mặc định là 1.0
    }

    // Phương thức khởi tạo với ba tham số
    public Triangle(double side1, double side2, double side3) {
        super(); // Gọi phương thức khởi tạo của lớp Shape
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Phương thức truy cập cho các cạnh của tam giác
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Phương thức tính diện tích của tam giác
    public double getArea() {
        double s = getPerimeter() / 2; // Nửa chu vi
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Công thức Heron
    }

    // Phương thức tính chu vi của tam giác
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Phương thức trả về thông tin tam giác dưới dạng chuỗi
    public String toString() {
        return "Triangle with sides: " + side1 + ", " + side2 + ", " + side3 +
                ", color: " + getColor() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
