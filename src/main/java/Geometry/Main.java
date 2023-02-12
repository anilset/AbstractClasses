package Geometry;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {

        Scanner sc = new Scanner(System.in);

        Square square = new Square(sc.nextDouble());
        System.out.println(square.getArea());

        Triangle triangle = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}

