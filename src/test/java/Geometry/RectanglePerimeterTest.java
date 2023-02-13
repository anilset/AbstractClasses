package Geometry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RectanglePerimeterTest {
    private final double sideLength1;
    private final double sideLength2;
    private final double expectedPerimeter;

    public RectanglePerimeterTest(double sideLength1, double sideLength2, double expectedPerimeter) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.expectedPerimeter = expectedPerimeter;
    }

    @Parameterized.Parameters
    public static Object[][] getRectanglePerimeterTestData() {
        return new Object[][] {
                {0.1, 0.001, 0.202},
                {1, 0.11, 2.22},
                {4.5, 5.5, 20},
                {3.3, 9.8, 26.2}
        };
    }

    @Test
    public void getRectanglePerimeterTest() {
        Parallelogram rectangle = new Rectangle(sideLength1, sideLength2);
        double actualPerimeter = rectangle.getPerimeter();
        assertEquals("Wrong perimeter", expectedPerimeter, actualPerimeter, 0.0000000003);
    }
}