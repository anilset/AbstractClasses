package Transport;

public class Boat implements Transport {
    private final boolean ground;

    public Boat(boolean ground) {
        this.ground = ground;
    }

    @Override
    public boolean isGround() {
        return ground;
    }
}
