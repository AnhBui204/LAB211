package Controller;

import java.util.Scanner;

public class Validation {
    private Scanner sc = new Scanner(System.in);
    public float checkValidNum(String mess){
        System.out.print(mess);
        while (true) {
            try{
                float result = Float.parseFloat(sc.nextLine());
                return result;
            }catch(NumberFormatException e){
                System.out.println("Please input a number!");
                System.out.print("Enter again: ");
            }
        }
    }
    public int getInt(){
        while (true) {            
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid integer.");
            }
        }
    }
}
