package ExceptionAndDebug.Triangle;

public class IllegalTriangleException extends RuntimeException {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
