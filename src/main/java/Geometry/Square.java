package Geometry;

public class Square extends Parallelogram{
    public Square (double sidelength1) {
            super(sidelength1);
        }

        @Override
    public double getArea () {
            return Math.pow(sideLength1, 2);
        }

        @Override
    public double getPerimeter() {
    return sideLength1 * 4;
    }
}



