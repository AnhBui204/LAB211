package Model;

public class Circle extends Shape {

    double radius;
    double area;
    double perimeter;
    final double pi = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * pi * radius;
        return perimeter;
    }

    @Override
    public double getArea() {
        area = pi * Math.pow(radius, 2);
        return area;
    }

    @Override
    public void printResult() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + Math.round(getArea()));
        System.out.println("Perimeter: " + Math.round(getPerimeter()));
    }

}
