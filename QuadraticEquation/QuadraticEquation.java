package QuadraticEquation;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức tính delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Phương thức kiểm tra có nghiệm hay không
    public boolean hasRoots() {
        return getDiscriminant() >= 0;
    }

    // Phương thức tính nghiệm
    public double[] getRoots() {
        double delta = getDiscriminant();
        if (delta < 0) {
            throw new IllegalArgumentException("Phương trình không có nghiệm thực.");
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            double sqrtDelta = Math.sqrt(delta);
            double root1 = (-b + sqrtDelta) / (2 * a);
            double root2 = (-b - sqrtDelta) / (2 * a);
            return new double[]{root1, root2};
        }
    }
}
