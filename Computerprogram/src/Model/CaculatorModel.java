/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author XUAN LINH
 */
public class CaculatorModel {
 public enum Operator {
     ADDITION("+"),SUBTRACTION("-"),MULTIPLICATION("*"),DIVISION("/"),EXPONENT("^"),EQUAL("=");
     private  String symbol;
     Operator (String symbol){
         this.symbol=symbol;
     }
     public String getSymbol(){
         return symbol;
     }
 }
 public enum BMI{
     UNDER_STANDARD,STANDARD,OVERWEIGHT,FAT_SHOULD_LOSE_WEIGHT, VERY_FAT_SHOULD_LOSE_WEIGHT_IMMEDIATELY;
 }
 public double calculate(double a, Operator operator,double b){
     switch (operator){
         case ADDITION:
             return a+b;
         case SUBTRACTION:
             return a-b;
         case MULTIPLICATION:
             return a*b;
         case DIVISION:
             if( b!=0){
                 return a/b;
             }else{
                 throw new ArithmeticException("Cannot divide by zero");
             }
         case EXPONENT:
             return Math.pow(a, b);
         default:
             throw new UnsupportedOperationException("Unsupported operator");
                     
     }
}
public BMI caculateBMI(double weight, double height){
    double bmi= weight/(height *height);
    if(bmi < 19){
        return BMI.UNDER_STANDARD;
    }else if(bmi<= 25){
        return BMI.STANDARD;
    }else if( bmi <= 30){
        return BMI.OVERWEIGHT;
    }else if(bmi <=40){
        return BMI.FAT_SHOULD_LOSE_WEIGHT;
    }else{
        return BMI.VERY_FAT_SHOULD_LOSE_WEIGHT_IMMEDIATELY;
    }
}
  public Operator checkOperator(String operator) {
        return Arrays.stream(Operator.values())
                .filter(op -> op.getSymbol().equals(operator))
                .findFirst()
                .orElse(null);
    }
} 
 
     