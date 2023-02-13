package Transport;

public class Car extends GroundTransport{
    private static int counter = 0;

    public Car(boolean ground, int wheelsCount) {

        super(ground, wheelsCount);
        id = ++counter;
        name = "Автомобиль легковой";
    }
}

