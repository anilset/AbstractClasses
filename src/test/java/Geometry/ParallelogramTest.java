package Geometry;
import org.junit.Assert;
import org.junit.Test;

public class ParallelogramTest {

    @Test
    public void getRectangleAreaTest() {
       Rectangle rectangle = new Rectangle(3,4);
        Assert.assertEquals("Wrong area", 12, rectangle.getArea(), 0.0);
    }

    @Test
    public void getRhombusAreaTest() {
        Rhombus rhombus = new Rhombus(5.6, 7.8);
        Assert.assertEquals("Wrong area", 43.68, rhombus.getArea(), 0.0);
    }

    @Test
    public void getSquareAreaTest() {
        Square square = new Square(4);
        Assert.assertEquals("Wrong area", 16, square.getArea(), 0.0);
    }
}