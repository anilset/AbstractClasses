package org.example;

public class Car extends Transport {
    protected Car() {
        super(4); // передаётся количество колёс
    }

    @Override
    public void ride() {
        System.out.println("Постоим немного в пробках, но доедем в компании :)");
    }

    @Override
    public String getPermittedRoad() {
        return "Шоссе";
    }
    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }
}
