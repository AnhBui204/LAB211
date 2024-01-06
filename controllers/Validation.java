package controllers;

import java.util.Random;
import java.util.Scanner;

public class Validation {
    private static Scanner sc = new Scanner(System.in);

    public int getInt() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }
    
    public int random() {
        return new Random().nextInt(20);
    }
}
