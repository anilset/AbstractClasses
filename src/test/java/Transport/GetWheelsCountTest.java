package Transport;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetWheelsCountTest {

    @Test
    public void isCarWheelsCountCorrect() {
        GroundTransport car = new Car(true, 4);
        assertEquals(4, car.getWheelsCount());
    }

    @Test
    public void isMotorcycleWheelsCountCorrect() {
        GroundTransport motorcycle = new Motorcycle(true, 3);
        assertEquals(3, motorcycle.getWheelsCount());
    }

    @Test
    public void isSportcarWheelsCountCorrect() {
        GroundTransport sportcar = new Sportcar(true, 4);
        assertEquals(4, sportcar.getWheelsCount());
    }

}