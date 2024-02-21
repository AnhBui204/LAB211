/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author XUAN LINH
 */
public class SalaryHistory {
    private String workerId;
    private double previousSalary;
    private double adjustedSalary;
    private String status;

    public SalaryHistory(String workerId, double previousSalary, double adjustedSalary, String status) {
        this.workerId = workerId;
        this.previousSalary = previousSalary;
        this.adjustedSalary = adjustedSalary;
        this.status = status;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public double getPreviousSalary() {
        return previousSalary;
    }

    public void setPreviousSalary(double previousSalary) {
        this.previousSalary = previousSalary;
    }

    public double getAdjustedSalary() {
        return adjustedSalary;
    }

    public void setAdjustedSalary(double adjustedSalary) {
        this.adjustedSalary = adjustedSalary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
            
}
