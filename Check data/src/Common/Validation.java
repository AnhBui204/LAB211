package Common;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private Scanner sc = new Scanner(System.in);

    public int inputNum() {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            return -1;

        }
    }

    public String inputString() {
        return sc.nextLine().trim();
    }

    public String checkPhone(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                System.out.println("Phone number must be number!");
                return "f";
            }

            if (num.length() != 10) {
                System.out.println("Phone number must be 10 digits!");
                return "f";
            }

            if (num.charAt(0) != '0') {
                System.out.println("Fisrt number must be 0!");
                return "f";
            }
        }
        return num;
    }

    public String checkDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            String.valueOf(sdf.parse(date));
            return date;
        } catch (Exception e) {
            System.out.println("Date to correct format(dd/mm/yyyy)!");
            return "f";
        }
    }

    public String checkMail(String email) {
        String emailPattern = "^[a-zA-Z]+([a-zA-Z0-9_&-][a-zA-Z0-9])*@([a-z]+.)+[a-z]{2,}$";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            return email;
        } else {
            System.out.println("Email must is correct format (...@gmail.com)!");
            return "f";
        }
    }
}
