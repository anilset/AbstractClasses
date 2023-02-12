package Geometry;

public class Square extends Parallelogram{
        public Square (double sidelength) {
            super(sidelength);
        }

        @Override
    public double getArea () {
            return Math.pow(sideLength, 2);
        }
    }

