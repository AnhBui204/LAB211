
package View;

import Common.Validation;
import Model.Rectangle;
import Model.Triangle;
import Model.Circle;

public class ShapeView{
    
    public Validation a = new Validation();
   Rectangle retangle = new Rectangle();
   Circle circle = new Circle();
   Triangle triangle = new Triangle();
   
   public void input(){
       System.out.println("Please input side width of Rectangle: ");
        retangle.setWidth(a.getDouble());
        System.out.println("Please input side length of Rectangle: ");
        retangle.setLength(a.getDouble());
        System.out.println("Please input radius of Circle: ");
        circle.setRadius(a.getDouble());
        System.out.println("Please input side A of Triangle:");
        triangle.setA(a.getDouble());
        System.out.println("Please input side B of Triangle:");
        triangle.setB(a.getDouble());
        System.out.println("Please input side C of Triangle:");
        triangle.setC(a.getDouble());
   }
    
   public void output(){
       System.out.println("----------Retangle----------");
       retangle.printResult();
       System.out.println("----------Circle----------");
       circle.printResult();
       System.out.println("----------Triangle----------");
       triangle.printResult();
   }
   
}