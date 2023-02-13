package Transport;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*; // импорт матчера containsString
import org.hamcrest.MatcherAssert;
import static org.junit.Assert.*;

public class TransportNamesTest {
    @Test
    public void isBoatNamesCorrect() {
    Boat boat = new Boat(false);
        Assert.assertThat(boat.getName(), containsString("Лодка"));}

    @Test
    public void isCarsNamesCorrect() {
        Car car = new Car(true, 4);
        Car sportcar = new Sportcar(true, 4);
        Assert.assertThat(car.getName(), startsWith("Автомобиль"));
        Assert.assertThat(sportcar.getName(), startsWith("Автомобиль"));
    }
        @Test
        public void isMotorcycleNamesEndsCorrect() {
            Motorcycle motorcycle = new Motorcycle(true, 2);
            Assert.assertThat(motorcycle.getName(), endsWith("цикл"));
        }

}