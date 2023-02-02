package org.example;

public class Bicycle extends Transport {
    // наследник

    public Bicycle() {
        super(2); // передаётся количество колёс
    }

    @Override
    public void ride() {
        System.out.println("Прокачу с ветерком!");
    }

    @Override
    public String getPermittedRoad() {
        return "Велосипедная дорожка";
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }
}
