package Transport;
import org.junit.Test;
import static org.junit.Assert.*;

public class TransportIdCounterTest {

    @Test
    public void isBoatIdIncrementedByOne() {
        Boat boatA = new Boat(false);
        Boat boatB = new Boat(false);
        Boat boatC = new Boat(false);
        Boat[] boats = new Boat[] {boatA, boatB, boatC};
        int counter = 0;
        for (int i = boats.length; i > 0; i--) {
            if (boats[boats.length - 1].getId() - boats[boats.length - 2].getId() == 1) {
                ++counter;
            }
        } assertEquals(3, counter);
    }

    @Test
    public void isGroundTransportIdCounterIncrementedByOne() {
        Car carA = new Car(true, 4);
        Car carB = new Car(true, 4);
        Car carC = new Car(true, 4);
        Car[] cars = new Car[]{carA, carB, carC};
        int counter = 0;
        for (int i = cars.length; i > 0; i--) {
            if(cars[cars.length - 1].getId() - cars[cars.length - 2].getId() == 1) {
                ++counter;
            }
        } assertEquals(3, counter);
    }
}