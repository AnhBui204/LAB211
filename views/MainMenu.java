package views;

import models.Elements;

public class MainMenu extends Menu {
    
    private Elements e = new Elements();
    
    public MainMenu(String title, String[] choices) {
        super(title, choices);
    }
    
    @Override
    public void execute(int ch){
        switch(ch){
            case 1:
                String[] sortChoices = {"Bubble sort", "Quick sort", "Back"};
                new SortMenu("Sort", sortChoices, e).run();
                break;
           case 2:
                String[] searchChoices = {"Linear search", "Binary search", "Back"};
                new SearchMenu("Search",searchChoices, e).run();
                break;
            
        }
    } 
}
