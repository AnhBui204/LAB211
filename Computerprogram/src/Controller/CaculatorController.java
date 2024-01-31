/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CaculatorModel;
import View.CaculatorView;
import java.util.Scanner;

/**
 *
 * @author XUAN LINH
 */
public class CaculatorController {
    private CaculatorModel model;
    private CaculatorView view;

    public CaculatorController(CaculatorModel model, CaculatorView view) {
        this.model = model;
        this.view = view;
    }
    public void ProcessUserInput(){
        Scanner sc= new Scanner(System.in);
        while(true){
            view.DisplayMenu();
            int option=sc.nextInt();
            switch(option){
                case 1:
                    performNormalCaculator(sc);
                    break;
                case 2:
                    performBMICalculator(sc);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    view.DisplayErrorMessage();
            }
        }
    }
    private void performNormalCaculator(Scanner sc){
        try{
            System.out.println("Enter the first number");
            double num1=Double.parseDouble(sc.next());
            System.out.println("Enter the operator (+, -, *, /, ^, =):");
            CaculatorModel.Operator operator=model.checkOperator(sc.next());
            System.out.println("Enter the second number: ");
            double num2=Double.parseDouble(sc.next());
            double result=model.calculate(num1, operator, num2);
            view.DisplayResult(result);
            
        }catch(NumberFormatException|NullPointerException|ArithmeticException e){
            view.DisplayErrorMessage();
        }
    }
    private void  performBMICalculator(Scanner sc){
        try{
            System.out.println("Enter your weight: ");
            double weight=Double.parseDouble(sc.next());
            System.out.println("Enter your height: ");
            double height =Double.parseDouble(sc.next());
            
            CaculatorModel.BMI bmistatus=model.caculateBMI(weight, height);
            view.DisplayBMIStatus(bmistatus);
        }catch(NumberFormatException|NullPointerException|ArithmeticException e){
            view.DisplayErrorMessage();
    }
}
}
   
