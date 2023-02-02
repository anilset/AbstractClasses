package org.example;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car(); // конструктор по умолчанию создаёт объект внутри класса Car
        System.out.println("Давай поедем на машине!");
        car.ride();

        Transport bicycle = new Bicycle(); // конструктор по умолчанию создаёт объект внутри класса Bicycle
        System.out.println("А теперь пересядем на велосипед.");
        bicycle.ride();
    }
}