package Geometry;
import org.junit.Test;
import static org.junit.Assert.*;
public class TriangleTest {

    @Test
    public void getAreaTest() {
        Triangle triangle = new Triangle(5, 6, 8);
        double actualResult = triangle.getArea();
        assertEquals("Wrong area", 15, triangle.getArea(), 0.0);
    }

    @Test
    public void getMaxSideTest() {
        Triangle triangle = new Triangle(2, 3, 4);
        assertEquals("Wrong max side", 4, triangle.getMaxSide(), 0.0);
    }

    @Test
    public void confirmExceptionThrowable() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 0.1, 1));
    }
}