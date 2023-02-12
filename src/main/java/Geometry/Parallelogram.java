package Geometry;

public abstract class Parallelogram implements AreaApplicable{
    protected double height;
    protected double width;
    protected double sideLength;

    // конструктор параллелограмма принимает на вход оба значения: высоту и ширину
    protected Parallelogram(double height, double width) {
        this.height = height;
        this.width = width;
    }

    protected Parallelogram (double sideLength) {
        this.sideLength = sideLength;
    }

    // площадь у любого параллелограмма считается одинаково - перемножением высоты и ширины, поэтому этот метод не абстрактный и имеет реализацию
    @Override
    public double getArea() {
        return height * width;
    }

}
