package QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        // Ví dụ sử dụng
        QuadraticEquation equation = new QuadraticEquation(12, -3, 2);
        if (equation.hasRoots()) {
            double[] roots = equation.getRoots();
            if (roots.length == 1) {
                System.out.println("Phương trình có nghiệm kép: " + roots[0]);
            } else {
                System.out.println("Phương trình có hai nghiệm: " + roots[0] + " và " + roots[1]);
            }
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}
