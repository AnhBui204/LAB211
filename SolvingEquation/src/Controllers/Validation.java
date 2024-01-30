package Controllers;

import java.util.Scanner;

public class Validation {

    

    public int getInt() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a valid integer.");
            }
        }
    }

    public boolean checkOdd(double n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEven(double n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkSquareNum(double n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }
}
