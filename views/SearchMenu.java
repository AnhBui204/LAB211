package views;

import controllers.SearchAlgorithm;
import java.util.Scanner;
import models.Elements;

public class SearchMenu extends Menu {
    private Scanner sc = new Scanner(System.in);
    private Elements e;
    
    public SearchMenu(String search, String[] searchChoices, Elements e) {
        super(search, searchChoices);
        this.e = e;
        this.e.display();
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter your number: ");
                int n = sc.nextInt();
                int i = new SearchAlgorithm().linearSearch(e.getArray(), n);
                System.out.println("Index is: " + i);
                System.out.println("\n----------");
                break;
            case 2:
                System.out.print("Enter your number: ");
                n = sc.nextInt();
                i = new SearchAlgorithm().binarySearch(e.getArray(), n);
                if (i == -1){
                    System.out.println("This array is not sorted!");
                } else {
                System.out.println("Index is: " + i);
                }
                System.out.println("\n----------");
                break;
        }
    }
}
