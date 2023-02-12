package Geometry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SquareTest {
    @Parameterized.Parameter
    public double sideLength;
    @Parameterized.Parameter(1)
    public double expected;

    @Parameterized.Parameters (name = "{index}: Square with side length {0} and area {1}")
    public static Object[] [] getSquareData() {
        return new Object[] [] {
                {2, 4},
                {3, 9},
                {10, 100},
                {1, 1}
        };
    }

    @Test
    public void squareGetAreaTest() {
        Parallelogram square = new Square(sideLength);
        double actual = square.getArea();
        assertEquals(expected, actual, 0.0);
    }
}