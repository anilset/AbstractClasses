package Geometry;

public abstract class Parallelogram implements AreaAndPerimeterCalculated {
    protected double sideLength1;
    protected double sideLength2;

    protected Parallelogram(double sideLength1, double sideLength2) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    protected Parallelogram (double sideLength1) {
        this.sideLength1 = sideLength1;
    }

    // площадь у любого параллелограмма считается одинаково - перемножением высоты и ширины, поэтому этот метод не абстрактный и имеет реализацию
    @Override
    public double getArea() {
        return sideLength1 * sideLength2;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideLength1 + sideLength2);
    }
}
