package View;

import Model.Worker;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class WorkerView {

    private ArrayList<Worker> DB = new ArrayList<>();
    private ArrayList<Worker> change = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addWorker() {
        System.out.println("Enter Worker details:");

        String Id;
        do {
            do {
                System.out.println("Enter Worker ID (Wx):");
                Id = sc.nextLine().toUpperCase().trim();
            } while (!isValidFormat(Id));
        } while (isDupplicate(Id));

        System.out.println("Worker name: ");
        String wName = sc.nextLine().toUpperCase().trim();
        int wAge = 0;
        do {
            try {
                System.out.println("Worker age: ");
                String age = sc.next();
                wAge = Integer.parseInt(age);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, age must be in range 18 to 50");
            }
        } while (wAge < 18 && wAge > 50);

        int wSalary = 0;
        do {
            try {
                System.out.println("Worker salary: ");
                String salary = sc.next();
                wSalary = Integer.parseInt(salary);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, salary must be > 0");
            }
        } while (wSalary <= 0);

        System.out.println("WorkLocation: ");
        String wWorkLocation = sc.next().toUpperCase().trim();
        sc.nextLine();

        Worker a = new Worker(Id, wName, wAge, wSalary, wWorkLocation);
        DB.add(a);

        System.out.println("Worker created successfully!");
    }

    private boolean isValidFormat(String Id) {
        if (Id.matches("W\\d+$")) {
            return true;
        } else {
            System.out.println("Invalid Id. Please enter in the format Wx.");
            return false;
        }
    }

    private boolean isDupplicate(String Id) {
        for (Worker worker : DB) {
            if (worker.getId().equalsIgnoreCase(Id)) {
                System.out.println("Id has been exist");
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("%-15s | %-15s | %-10s | %-15s | %-15s | %-10s | %-20s\n", "WorkerID", "WorkerName", "WorkerAge",
                 "WorkerSalary", "WorkLocation","Status" , "Date");

        for (Worker worker : change) {
            System.out.printf("%-15s | %-15s | %-10s | %-15s | %-15s | %-10s | %-20s\n",
                    worker.getId(), worker.getName(), worker.getAge(),
                    worker.getSalary(), worker.getWorkLocation(),worker.getStatus(),worker.getDate());
        }

        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public void increaseSalary(){
        System.out.println("Enter code to increase Salary: ");
        String Id = sc.nextLine().toUpperCase().trim();
        Worker foundWorker = findWorker(Id);
        if(foundWorker == null){
            System.out.println("Worker not found.");
            return;
        }
        int raise=0;
        do {
            try {
                System.out.println("Enter amount money to raise: ");
                String salary = sc.next();
                raise = Integer.parseInt(salary);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, Amount of money must be > 0");
            }
        } while (raise <= 0);
        int newSalary = foundWorker.getSalary() + raise;
        String status = "UP";
        Date date = new Date();
        Worker a = new Worker(foundWorker.getId(), foundWorker.getName(), foundWorker.getAge(), newSalary, foundWorker.getWorkLocation(),status,date);
        change.add(a);
    }
    
    public void decreaseSalary(){
        System.out.println("Enter code to decrease Salary: ");
        String Id = sc.nextLine().toUpperCase().trim();
        Worker foundWorker = findWorker(Id);
        if(foundWorker == null){
            System.out.println("Worker not found.");
            return;
        }
        int raise=0;
        do {
            try {
                System.out.println("Enter amount money to cut: ");
                String salary = sc.next();
                raise = Integer.parseInt(salary);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, Amount of money must be > 0");
            }
        } while (raise <= 0);
        int newSalary = foundWorker.getSalary() - raise;
        String status = "DOWN";
        Date date = new Date();
        Worker a = new Worker(foundWorker.getId(), foundWorker.getName(), foundWorker.getAge(), newSalary, foundWorker.getWorkLocation(),status,date);
        change.add(a);
    }
    
    private Worker findWorker(String Id) {
        for (Worker a : DB) {
            if (a.getId().equalsIgnoreCase(Id)) {
                return a;
            }
        }
        return null;
    }
}
