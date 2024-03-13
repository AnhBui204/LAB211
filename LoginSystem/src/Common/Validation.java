package Common;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private Scanner sc;

    public Validation() {
        sc = new Scanner(System.in);
    }

    public int checkNum(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
    }

    public String checkAccountNum(String an) {
        String pattern = "^\\d{10}$";
        Pattern regex = Pattern.compile(an);
        Matcher matcher = regex.matcher(an);
        if (matcher.matches()) {
            return an;
        } else {
            System.out.println("So tai khoan phai la 1 so va phai co 10 chu so");
            return "f";
        }
    }

    public String checkPassword(String pass) {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

        Pattern regex = Pattern.compile(pass);
        Matcher matcher = regex.matcher(pass);
        if (matcher.matches()) {
            return pass;
        } else {
            System.out.println("Mat khau phai trong khoang 8-31 ky tu va phai chua ky tu va so");
            return "f";
        }
    }

}
