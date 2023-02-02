package Transport;

public abstract class GroundTransport implements Transport {
    protected boolean ground;
    protected int wheelsCount;

    public GroundTransport (boolean ground, int wheelsCount) {
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }
    public int getWheelsCount() { // нет слова abstract
        return wheelsCount;
    }
    public boolean isGround() {
        return ground;
    }
}
