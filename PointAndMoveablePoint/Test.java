package PointAndMoveablePoint;

public class Test {
    public static void main(String[] args) {
        // Kiểm thử class Point
        Point point = new Point(2, 3);
        System.out.println("Point: " + point); // Output: (2.0, 3.0)
        point.setXY(5, 6);
        System.out.println("Updated Point: " + point); // Output: (5.0, 6.0)

        // Kiểm thử class MoveablePoint
        MoveablePoint MoveablePoint = new MoveablePoint(1, 2, 0.5f, 1.5f);
        System.out.println("MoveablePoint: " + MoveablePoint); // Output: (1.0, 2.0), speed=(0.5, 1.5)

        MoveablePoint.move();
        System.out.println("After move: " + MoveablePoint); // Output: (1.5, 3.5), speed=(0.5, 1.5)

        MoveablePoint.setSpeed(1.0f, 1.0f);
        MoveablePoint.move();
        System.out.println("After changing speed and moving: " + MoveablePoint); // Output: (2.5, 4.5), speed=(1.0, 1.0)

    }
}
