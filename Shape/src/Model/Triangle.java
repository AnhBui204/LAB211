package Model;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    double A;
    double B;
    double C;
    double area;
    double perimeter;

    public Triangle() {
    }

    public Triangle(double A, double B, double C, double area, double perimeter) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

    @Override
    public double getPerimeter() {
        perimeter = A + B + C;
        return perimeter;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        area = sqrt(p * (p - A) * (p - B) * (p - C));
        return area;
    }

    @Override
    public void printResult() {
        System.out.println("Side A: " + A);
        System.out.println("Side B: " + B);
        System.out.println("Side C: " + C);
        System.out.println("Area: " + Math.round(getArea()));
        System.out.println("Perimeter: " + Math.round(getPerimeter()));
    }

}
