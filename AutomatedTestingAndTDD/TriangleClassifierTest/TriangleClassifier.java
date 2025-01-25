package AutomatedTestingAndTDD.TriangleClassifierTest;

public class TriangleClassifier {
    public static String classifyTriangles(int sideA, int sideB, int sideC) {
        if(isTriangle(sideA, sideB, sideC)) {
            if(sideA == sideB && sideA == sideC) return "Tam giác đều";
            else if(sideA == sideB || sideA == sideC || sideC == sideB) return "Tam giác cân";
            else return "Tam giác thường";
        }
        return "Không phải là tam giác";
    }

    public static boolean isTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB > sideC &&
                sideB + sideC > sideA &&
                sideA + sideC > sideB ;
    }
}
