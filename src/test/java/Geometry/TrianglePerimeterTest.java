package Geometry;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TrianglePerimeterTest {

    private final double side1;
    private final double side2;
    private final double side3;
    private final double expectedResult;
    private final double delta;

    public TrianglePerimeterTest(double side1, double side2, double side3, double expectedResult, double delta) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.expectedResult = expectedResult;
        this.delta = delta;
    }

    @Parameters (name = "{index}: Triangle with sides {0}, {1}, {2} with perimeter {3} and delta {4}")
    public static Object[][] getTriangleTestData() {
        return new Object[][] {
            {2, 3, 4, 9, 0},
            {2.0, 3.1, 4.5, 9.6, 0},
            {2.9, 3.1, 4.6, 10.6, 0}
        };
    }

    @Test
    public void trianglePerimeterTest() {
        Triangle triangle = new Triangle(side1, side2, side3);
        double actualResult = triangle.getPerimeter();
        assertEquals("Wrong area", expectedResult, actualResult, delta);
    }

}
