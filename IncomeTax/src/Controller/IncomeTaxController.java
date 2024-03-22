package Controller;

import Model.Worker;
import Common.Validation;
import View.IncomeTaxView;

public class IncomeTaxController {

    Worker worker = new Worker();
    Validation val = new Validation();
    IncomeTaxView v = new IncomeTaxView();
    
    public Worker input(){
        int count = 0;
        v.under18();
        int duoi18 = val.getInt();
        v.study18();
        int hoc18 = val.getInt();
        v.nonStudy18();
        int khonghoc18 = val.getInt();
        v.fatherInfo();
        int ageF = val.getInt();
        if(ageF >= 60)
            count += 1;
        v.motherInfo();
        int ageM = val.getInt();
        if(ageM >= 55)
            count += 1;
        v.parent(count);
        int numOfParent = count;
        v.broSis();
        int numOfBroSis = val.getInt();
        
        Worker a = new Worker(duoi18, hoc18, khonghoc18, numOfBroSis, numOfParent);
        return a;
    }
    
    public void run(){
        v.head();
        int total = val.getInt();
        Worker a = input();
        int taxableIncome = worker.taxableIncome(total,a);
        v.taxable(taxableIncome);
        int tax = worker.tax(taxableIncome, total);
        v.paid(tax);
    }
    
}