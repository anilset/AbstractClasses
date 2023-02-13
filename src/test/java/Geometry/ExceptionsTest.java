package Geometry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class ExceptionsTest {

    private final double side1;
    private final double side2;
    private final double side3;

    public ExceptionsTest (double side1, double side2, double side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Parameterized.Parameters
    public static Object[] [] getTriangleExceptionTestData() {
        return new Object[][] {
                {0, 1, 0.01},
                {0.01, 0, 0.01},
                {0.1, 0.01, 0},
                {-1, 0.01, 0.01},
                {0.01, -1, 1},
                {0.01, 0.01, -1}
        };
    }

    @Test
    public void triangleExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(side1, side2, side3));
    }
}