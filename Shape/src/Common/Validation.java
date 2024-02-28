package Common;

import java.util.Scanner;

public class Validation {
    private static Scanner sc = new Scanner(System.in);
    
    public double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static void closeScanner(){
        sc.close();
    }
}
