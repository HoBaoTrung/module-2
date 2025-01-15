package Point;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Point2D {
    private float x,y;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
        x=0;
        y=0;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+")";
    }
}
