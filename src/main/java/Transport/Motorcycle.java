package Transport;

public class Motorcycle extends GroundTransport {
    static int counter = 0;

    public Motorcycle (boolean ground, int wheelsCount) {
        super(ground, wheelsCount);
        id = ++counter;
        name = "Мотоцикл";
    }
}
