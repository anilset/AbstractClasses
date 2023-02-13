package Transport;

public class Main {
    public static void main(String[] args) {
        Transport boat1 = new Boat(false);
            System.out.println(boat1.getName() +". Артикул " + boat1.getId());
            System.out.println("Является ли транспорт наземным: " + boat1.isGround());

        Transport boat2 = new Boat(false);
            System.out.println(boat2.getName() + ". Артикул " + boat2.getId());
            System.out.println("Является ли транспорт наземным: " + boat2.isGround());

            Transport boat3 = new Boat(false);
                System.out.println(boat3.getName() + ". Артикул " + boat3.getId());
                System.out.println("Является ли транспорт наземным: " + boat3.isGround());


        GroundTransport motorcycle1 = new Motorcycle(true, 2);
            System.out.println(motorcycle1.getName() + ". Артикул " + motorcycle1.getId());
            System.out.println("Является ли транспорт наземным: " + motorcycle1.isGround());
            System.out.println("Количество колёс: " + motorcycle1.getWheelsCount());


        GroundTransport motorcycle2 = new Motorcycle(true, 3);
            System.out.println(motorcycle2.getName() + ". Артикул " + motorcycle2.getId());
            System.out.println("Является ли транспорт наземным: " + motorcycle2.isGround());
            System.out.println("Количество колёс: " + motorcycle2.getWheelsCount());


        GroundTransport car = new Car(true, 4);
            System.out.println(car.getName() + ". Артикул " + car.getId());
            System.out.println("Является ли транспорт наземным: " + car.isGround());
            System.out.println("Количество колёс: " + car.getWheelsCount());


        Car sportcar = new Sportcar(true, 4);
        System.out.println(sportcar.getName() + ". Артикул " + sportcar.getId());
        System.out.println("Является ли транспорт наземным: " + sportcar.isGround());
        System.out.println("Количество колёс: " + sportcar.getWheelsCount());
    }
}
