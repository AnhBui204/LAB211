/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.WorkerController;
import Model.SalaryHistory;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author XUAN LINH
 */
public class WorkerView {
     private WorkerController controller;

    public WorkerView(WorkerController controller) {
        this.controller = controller;
    }
     public void DisplayMenu(){
         System.out.println("Worker Management System");
         System.out.println("1.Add worker");
         System.out.println("2.Increase Salary");
         System.out.println("3.Decrease Salary");
         System.out.println("4.Adjusted Salary");
         System.out.println("5.Exit");
     }
     public void run(){
         Scanner sc=new Scanner(System.in);
         while(true){
         DisplayMenu();
         System.out.println("Enter your choice: ");
         int choice=sc.nextInt();
         switch(choice){
             case 1:  
                 addWorker();
                 break;
             case 2:
                 changeSalary(true);
                 break;
             case 3:
                 changeSalary(false);
                 break;
             case 4:
                 showAdjustedSalaryWorkers();
                 break;
             case 5:
                 System.out.println("Exit ");
                 break;
             default:
                 System.out.println("Invalid choice. Please choose again!");
         }
        }    
     }
     private void addWorker(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter worker's ID: ");
         String id=sc.next();
         System.out.println("Enter worker's name: ");
         String name=sc.next();
         System.out.println("Enter worker's age: ");
         int age=sc.nextInt();
         System.out.println("Enter worker's salary: ");
         double salary=sc.nextDouble();
         System.out.println("Enter worker location: ");
         String location=sc.next();
         boolean success=controller.addWorker(id, name, age, salary, location);
         if(success){
             System.out.println("Add worker successfully");
         }else{
             System.out.println("Error");
         }
     }
     private void changeSalary(boolean increase){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter worker ID: ");
         String id=sc.next();
         System.out.println("Enter amount of money to"+(increase ?"increase":"decrease")+": ");
         double amount=sc.nextDouble();
         boolean success=controller.changeSalary(id, amount, increase);
         if(success){
             System.out.println("Salary"+(increase ?"increase":"decrease")+"successfully ");
         }else{
             System.out.println("Error");
         }
     }
    private void showAdjustedSalaryWorkers(){
        List<SalaryHistory>salaryhistories=controller.getInformationSalary();
        if(salaryhistories.isEmpty()){
            System.out.println("no worker has salary adjusted");
        }else{
            System.out.println("Adjusted Salary Worker ");
            for(SalaryHistory History:salaryhistories){
                System.out.println("Worker ID: "+History.getWorkerId());
                System.out.println("Previous Salary: "+ History.getPreviousSalary());
                System.out.println("Adjusted Salary: "+History.getAdjustedSalary());
                System.out.println("Status: "+History.getStatus());
            }
        }
    }
}
