
package View;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public int[] getInputGarbageAtStations() {
        System.out.println("Nhap luong rac tai moi tram (don vi: kg), nhap 'done' de ket thuc:");
        String[] inputs = scanner.nextLine().split(" ");
        int[] garbageAtStations = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i].equals("done")) {
                break;
            }
            garbageAtStations[i] = Integer.parseInt(inputs[i]);
        }
        return garbageAtStations;
    }

    public void displayTotalCost(double totalCost) {
        System.out.println("Tong chi phi la " + String.format("%,.0f", totalCost) + " VND");
    }

    public void closeScanner() {
        scanner.close();
    }
}
