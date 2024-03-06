package Controllers;

import Common.Validation;
import Models.CheckData;
import Views.checkDataViews;

public class CheckDataController {

    private CheckData data;
    private checkDataViews view;
    private Validation val;

    public CheckDataController() {
        data = new CheckData();
        view = new checkDataViews();
        val = new Validation();
    }
    
    

    public void run() {
        while (true) {
            view.inputPhoneNumber();
            data.setPhoneNum(val.inputString());
            if (!data.getPhoneNum().equals("f")) {
                break;
            }
        }

        while (true) {
            view.inputEmail();
            data.setEmail(val.inputString());
            if (!data.getEmail().equals("f")) {
                break;
            }
        }

        while (true) {
            view.inputDate();
            data.setDate(val.inputString());
            if (!data.getDate().equals("f")) {
                break;
            }
        }
        System.out.println("======Display======");
        display();

    }

    public void display() {
        System.out.println(data);
    }

}
