package Model;

public class Rectangle extends Shape {

    double width;
    double length;
    double area;
    double perimeter;

    public Rectangle() {
    }

    public Rectangle(double width, double length, double area, double perimeter) {
        this.width = width;
        this.length = length;
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        perimeter = (width + length) * 2;
        return perimeter;
    }

    @Override
    public double getArea() {
        area = width * length;
        return area;
    }

    @Override
    public void printResult() {
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + Math.round(getArea()));
        System.out.println("Perimeter: " + Math.round(getPerimeter()));
    }

}
