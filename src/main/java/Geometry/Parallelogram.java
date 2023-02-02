package Geometry;

public abstract class Parallelogram {
    private double height;
    private double width;

    // конструктор параллелограмма принимает на вход оба значения: высоту и ширину
    protected Parallelogram(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // площадь у любого параллелограмма считается одинаково - перемножением высоты и ширины, поэтому этот метод не абстрактный и имеет реализацию
    public double getArea() {
        return height * width;
    }

}
