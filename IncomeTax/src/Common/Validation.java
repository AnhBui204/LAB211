package Common;

import java.util.Scanner;

public class Validation {
    private static Scanner sc = new Scanner(System.in);

    public int getInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static void closeScanner(){
        sc.close();
    }
}
