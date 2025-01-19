package Resizeable;

public class Square extends Rectangle {
    Square(double size) {
        super(size, size);
    }
    Square() {}
    Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }
    public double getSize() {
        return this.getWidth();
    }

    public void setSize(double size) {
        this.setLength(size);
        this.setWidth(size);
    }

    @Override
    public String toString() {
        return "A Square with size="
                + getWidth()
                + ", which is a subclass of "
                + super.toString();
    }

}
