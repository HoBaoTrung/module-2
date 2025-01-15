package Triangle;
public class Shape {
    private String color;

    // Phương thức khởi tạo mặc định
    public Shape() {
        this.color = "red"; // Màu sắc mặc định là đỏ
    }

    // Phương thức khởi tạo với tham số màu sắc
    public Shape(String color) {
        this.color = color;
    }

    // Phương thức truy cập cho thuộc tính color
    public String getColor() {
        return this.color;
    }

    // Phương thức thiết lập màu sắc
    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức trả về thông tin hình học dưới dạng chuỗi
    public String toString() {
        return "Shape color: " + color;
    }
}

