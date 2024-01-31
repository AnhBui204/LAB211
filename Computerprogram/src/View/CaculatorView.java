/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.CaculatorModel;

/**
 *
 * @author XUAN LINH
 */
public class CaculatorView {
    public void DisplayMenu(){
     System.out.println("Select an option:");
     System.out.println("1. Normal Calculator");
     System.out.println("2. BMI Calculator");
     System.out.println("3. Exit");   
    }
    public void DisplayResult(double result){
        System.out.println("Result: "+result);
    }
    public void DisplayBMIStatus(CaculatorModel.BMI bmistatus){
        System.out.println("BMI Status: "+ bmistatus);
    }
    public void DisplayErrorMessage(){
        System.out.println("Error");
    }
}
