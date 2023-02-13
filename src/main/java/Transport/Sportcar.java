package Transport;

public class Sportcar extends Car {
    static int counter = 0;
    public Sportcar (boolean ground, int wheelsCount) {

        super(ground, wheelsCount);
        id = ++counter;
        name = "Автомобиль спортивный";
    }
}
