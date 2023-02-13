package Transport;

public class Boat implements Transport {
    private String name;
    private final boolean ground;
    private static int counter = 0;
    private int id;

    public Boat(boolean ground) {
        this.name = "Лодка";
        this.ground = ground;
        id = ++counter;

    }

    @Override
    public boolean isGround() {
        return ground;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
