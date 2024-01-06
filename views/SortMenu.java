package views;

import controllers.SortAlgorithm;
import models.Elements;

public class SortMenu extends Menu {
    
    private Elements e;
    
    public SortMenu(String title, String[] choices, Elements e) {
        super(title, choices);
        this.e = e;
        this.e.display();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("----------\nAfter bubble sort: ");
                e.setArray(new SortAlgorithm().bubbleSort(e.getArray()));
                e.display();
                System.out.println("\n----------");
                break;
            case 2:
                System.out.println("----------\nAfter quick sort: ");
                e.setArray(new SortAlgorithm().quickSort(e.getArray(), 0, e.getSize() - 1));
                e.display();
                System.out.println("\n----------");
                break;
        }
    }

}
