package Transport;
import org.junit.Test;
import static org.junit.Assert.*;

public class BooleansTest {
    @Test
    public void isBoatGroundFalseTest() {
        Boat boat = new Boat(false);
        assertFalse(boat.isGround());
    }

    @Test
    public void isBoatNotGroundTrueTest() {
        Boat boat = new Boat(false);
        assertTrue(boat.isGround()== false);
    }
    @Test
    public void isCarGroundTrueTest() {
        GroundTransport car = new Car(true, 4);
        assertTrue(car.isGround());
    }
    @Test
    public void isMotorcycleGroundTrueTest() {
        GroundTransport motorcycle = new Motorcycle(true,2);
        assertTrue(motorcycle.isGround());
    }
    @Test
    public void isSportcarGroundTrueTest() {
        GroundTransport sportcar = new Sportcar(true,4);
        assertTrue(sportcar.isGround());
    }

}
