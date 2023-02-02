package org.example;

public abstract class Transport {
    protected int wheelsCount;

    protected Transport(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    // метод отвечает за перевозку людей
    public abstract void ride();

    // метод будет возвращать, по какой дороге разрешено передвигаться транспорту
    public abstract String getPermittedRoad();

    // метод будет возвращать количество колёс транспортного средства
    public abstract int getWheelsCount();
}
