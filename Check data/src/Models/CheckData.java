package Models;

import Common.Validation;

public class CheckData {
    private String phoneNum, email, date;
    private Validation val;

    public CheckData() {
        val = new Validation();
        this.phoneNum = "";
        this.email = "";
        this.date = "";
    }

    public String getPhoneNum() {
        phoneNum = val.checkPhone(phoneNum);
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        email = val.checkMail(email);
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        date = val.checkDate(date);
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Validation getVal() {
        return val;
    }

    public void setVal(Validation val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "phoneNum = " + phoneNum + 
                "\nemail = " + email + 
                "\ndate = " + date;
    }
    
    
 
}
