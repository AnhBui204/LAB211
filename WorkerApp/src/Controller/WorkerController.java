/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.SalaryHistory;
import Model.Worker;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XUAN LINH
 */
public class WorkerController {
    private List<Worker>workers;
    private List<SalaryHistory> salaryHistories;

    public WorkerController(){
        this.workers=new ArrayList<> ();
        this.salaryHistories=new ArrayList<> ();
        }
    public boolean addWorker(String id, String name, int age,double salary, String location){
    //check for duplicate Id
      for(Worker worker : workers){
          if(worker.getId().equals(id)){
              return false;
          }
      }
      //validate age and salary
      if (age <18 || age >50 || salary <=0){
          return false;
      }
      Worker newWorker= new Worker(id,name, age, salary,location);
       workers.add(newWorker);
        return true;
    }
    public boolean changeSalary (String id, double amount, boolean increase){
        Worker targetWorker=null;
        //Find worker with the specified ID
        for(Worker worker : workers){
          if(worker.getId().equals(id)){
              targetWorker=worker;
              break;
          }
    }
        if(targetWorker == null || amount <=0){
            return false;
        }
        double previousSalary = targetWorker.getSalary();
        double adjustedSalary= increase ? targetWorker.getSalary()+ amount: targetWorker.getSalary()-amount;
        SalaryHistory salaryHistory = new SalaryHistory(id, previousSalary, adjustedSalary,
                (increase ? "Increased" : "Decreased"));
        salaryHistories.add(salaryHistory);

        // Update worker's salary
        targetWorker.setSalary(adjustedSalary);

        return true;
    }

    public List<SalaryHistory> getInformationSalary() {
        return salaryHistories;
    }
}
