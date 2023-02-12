package Geometry;
import org.junit.Assert;
import org.junit.Test;

public class ParallelogramTest {

    @Test
    public void getRectangleAreaTest() {
       Rectangle rectangle = new Rectangle(3,4);
        Assert.assertEquals("Wrong area", 12, rectangle.getArea(), 0.0);
    }
}