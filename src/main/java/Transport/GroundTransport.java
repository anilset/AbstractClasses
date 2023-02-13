package Transport;

public abstract class GroundTransport implements Transport {
    protected boolean ground;
    protected int wheelsCount;
    protected int id;
    protected String name;


    public GroundTransport (boolean ground, int wheelsCount) {
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean isGround() {
        return ground;
    }

    public int getWheelsCount() { // нет слова abstract

        return wheelsCount;
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

