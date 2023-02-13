package Geometry;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RectangleAreaTest {

    private final double sideLength1;
    private final double sideLength2;
    private final double expectedArea;

    public RectangleAreaTest(double sideLength1, double sideLength2, double expectedArea){
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.expectedArea = expectedArea;
    }

    @Parameterized.Parameters (name = "{index} : Rectangle with side1 {0}, site2 {1} and area {2}")
    public static Object[][] getRectangleAreaTestData() {
        return new Object[][]{
                {0.1, 0.001, 0.0001},
                {2, 8, 16},
                {3, 13, 39},
                {0.5, 4, 2}
        };
    }
    @Test
    public void getRectangleAreaTest() {
       Parallelogram rectangle = new Rectangle (sideLength1, sideLength2);
       double actualArea = rectangle.getArea();
       Assert.assertEquals("Wrong area", expectedArea, actualArea, 0.0);
    }
}