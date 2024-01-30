package Views;

import Controllers.EquationControllers;
import Models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EquationView extends Menu{
    
    public Scanner sc = new Scanner(System.in);
    protected EquationControllers controller = new EquationControllers(this);
    
    
    public EquationView(String[] choices, String title) {
        super(choices, title);
        super.run();
    }
    
    @Override
    public void execute(int choice){
        controller.changeView(choice);
    }
    public void calculateSuperlativeEquation(){
        System.out.print("Enter A: ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.print("Enter B: ");
        float b = Float.parseFloat(sc.nextLine());
        
        SuperlativeEquation equation = new SuperlativeEquation(a,b);
        equation.calculate();
        if(equation.isSolved()){
            System.out.println("Solution: x = " + equation.getX());
        } else {
            System.out.println("No solution!");
        }
        System.out.print("Number is Odd: ");
        printList(equation.getOddList());
        System.out.print("Number is Even: ");
        printList(equation.getEvenList());
        System.out.print("Number is Perfect Square: ");
        printList(equation.getPerfectSquareList());
        
    }
    public void calculateQuadricEquation(){
        System.out.print("Enter A: ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.print("Enter B: ");
        float b = Float.parseFloat(sc.nextLine());
        System.out.print("Enter C: ");    
        float c = Float.parseFloat(sc.nextLine());
        
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        equation.calculate();
        if(equation.isSolved()){
            System.out.println("Solution: x1 = " + equation.getX1() +" and x2 = " + equation.getX2());
        } else {
            System.out.println("No solution!");
        }
        System.out.print("Number is Odd: ");
        printList(equation.getOddList());
        System.out.print("Number is Even: ");
        printList(equation.getEvenList());
        System.out.print("Number is Perfect Square: ");
        printList(equation.getPerfectSquareList());
    }
    
    public void printList(ArrayList<Float> list){
        if(list.size() == 0) System.out.println(""); 
        int count = 1;
        for(float item: list){
            System.out.print(item);
            if(list.size() == count){
                System.out.println("");
            } else{
                System.out.print(", ");
                count++;
            }
        }
    }
}
