package Controllers;

import Model.Fruit;
import java.util.ArrayList;
import java.util.Scanner;

public class FruitController {

    Scanner sc = new Scanner(System.in);
    ArrayList<ShopFruitManagement> fruitList = new ArrayList<>();

    public void createFruit() {
        Fruit a = new Fruit();
        System.out.println("---------Fruit detail---------");
        System.out.println("Enter fruit ID:");
        a.setFruitID(sc.nextLine());
        System.out.println("Enter fruit Name:");
        a.setFruitName(sc.nextLine());
        System.out.println("Fruit price:");
        a.setPrice(sc.nextInt());
        System.out.println("Fruit quantity:");
        a.setQuantity(sc.nextInt());
        System.out.println("Fruit origin:");
        a.setOrigin(sc.nextLine());
        sc.nextLine();

        fruitList.add(a);
    }

    public void checkYN() {
    while (true) {
        System.out.println("Do you want to continue (Y/N)?");
        String input = sc.nextLine().trim();
        if (input.equalsIgnoreCase("y")) {
            createFruit();
        } else if (input.equalsIgnoreCase("n")) {
            display();
            return;
        } else {
            System.out.println("Invalid input. Please try again:");
        }
    }
}

    
    public void display(){
        System.out.printf("%-5s | %-15s | %-5s | %-5s | %-15s%n", "ID", "Fruit name", "Price", "Quantity", "Origin");
        for(Fruit fruit : fruitList){
            System.out.printf("%-5s | %-15s | %-5s | %-5s | %-15s%n", fruit.getFruitID(), fruit.getFruitName(), fruit.getPrice(),fruit.getQuantity(),fruit.getOrigin());
        }
    }

}
