package AutomatedTestingAndTDD.TriangleClassifierTest;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
    @Test
    public void testEquilateralTriangle() {
        int firstSide = 2, secondSide = 2, thirdSide = 2;
        String expected = "Tam giác đều";
        String actual = TriangleClassifier.classifyTriangles(firstSide, secondSide, thirdSide);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsoscelesTriangle() {
        int firstSide = 2, secondSide = 2, thirdSide = 3;
        String expected = "Tam giác cân";
        String actual = TriangleClassifier.classifyTriangles(firstSide, secondSide, thirdSide);
        assertEquals(expected, actual);
    }

    @Test
    public void testScaleneTriangle() {
        int firstSide = 3, secondSide = 4, thirdSide = 5;
        String expected = "Tam giác thường";
        String actual = TriangleClassifier.classifyTriangles(firstSide, secondSide, thirdSide);
        assertEquals(expected, actual);
    }

    @Test
    public void testNotTriangle1() {
        int firstSide = 8, secondSide = 2, thirdSide = 3;
        String expected = "Không phải là tam giác";
        String actual = TriangleClassifier.classifyTriangles(firstSide, secondSide, thirdSide);
        assertEquals(expected, actual);
    }

    @Test
    public void testNotTriangle2() {
        int firstSide = -1, secondSide = 2, thirdSide = 1;
        String expected = "Không phải là tam giác";
        String actual = TriangleClassifier.classifyTriangles(firstSide, secondSide, thirdSide);
        assertEquals(expected, actual);
    }

    @Test
    public void testNotTriangle3() {
        int firstSide = 0, secondSide = 1, thirdSide = 1;
        String expected = "Không phải là tam giác";
        String actual = TriangleClassifier.classifyTriangles(firstSide, secondSide, thirdSide);
        assertEquals(expected, actual);
    }
}
