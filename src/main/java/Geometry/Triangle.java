package Geometry;

public class Triangle implements AreaAndPerimeterCounted {

    private double side1;
    private double side2;
    private double side3;
    public Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        for (double side : new double[]{side1, side2, side3}) {
            if (side <= 0.0) {
                throw new IllegalArgumentException();
            }
        }
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea(){
        double halfPerimeter = getPerimeter()/2.0;
        return Math.round(Math.sqrt(halfPerimeter
                * (halfPerimeter - side1)
                * (halfPerimeter - side2)
                * (halfPerimeter - side3)));
    }
    public double getMaxSide() {
    double maxSide = side1;
    for (double side : new double[] {side2, side3})
        if (side > maxSide) {
            maxSide = side;
        } return maxSide;
    }

}
