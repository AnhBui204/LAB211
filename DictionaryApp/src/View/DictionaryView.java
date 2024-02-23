/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;

/**
 *
 * @author XUAN LINH
 */
public class DictionaryView {
 public void DisplayMenu(){
     System.out.println("1.Add Word");
     System.out.println("2. Remove Word");
     System.out.println("3.Search Word");
     System.out.println("4.Exit");
     System.out.println("Enter your choice: ");
 }    
 public void DisplayMessage(String message){
     System.out.println(message);
 }
 public String getInput(){
     Scanner sc=new Scanner(System.in);
     return sc.nextLine().toLowerCase();
 }
 
}
