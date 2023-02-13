package Geometry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SquareTest {
    @Parameterized.Parameter
    public double sideLength;
    @Parameterized.Parameter(1)
    public double expectedArea;
    @Parameterized.Parameter(2)
    public double expectedPerimeter;

    @Parameterized.Parameters (name = "{index}: Square with side length {0}, area {1} and perimeter {2}")
    public static Object[] [] getSquareAreaData() {
        return new Object[] [] {
                {2, 4, 8},
                {3, 9, 12},
                {10, 100, 40},
                {1, 1, 4}
        };
    }

    @Test
    public void getSquareAreaTest() {
        Parallelogram square = new Square(sideLength);
        double actual = square.getArea();
        assertEquals(expectedArea, actual, 0.0);
    }

    @Test
    public void getSquarePerimeterTest() {
        Parallelogram square = new Square(sideLength);
        double actual = square.getPerimeter();
        assertEquals(expectedPerimeter, actual, 0);
    }
}