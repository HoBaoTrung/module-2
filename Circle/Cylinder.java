package Circle;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        this.height = 1;
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*super.getArea() + 2*getRadius()*Math.PI*height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                + " and height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
