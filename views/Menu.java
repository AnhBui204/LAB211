package views;

import controllers.Validation;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Menu {
    
    private String title;
    private ArrayList<String> choices;
    
    public Menu(String title, String[] choices){
        this.title = title;
        this.choices = new ArrayList<>();
        for (String c : choices) {
            this.choices.add(c);
        }
    }
    
    private void display(String title,ArrayList<String> al){
        System.out.println("\n" + title);
        System.out.println("--------------------------------------");
        for(int i=0;i<al.size();i++){
            System.out.println((i+1)+". "+al.get(i));
        }
        System.out.println("--------------------------------------");
    }
    
    public void run(){
   
        while(true){
            int choice = getSelected();
            if((choice <= choices.size() - 1) && (choice >= 1))
                execute(choice);
            else if (choice == choices.size())
                break;
            else {
                System.out.println("--------------\nTry again!!\n--------------");
            }                 
        }
    }
    
    public abstract void execute(int choice);
    
    public int getSelected(){
        display(title,choices);
        System.out.print("Enter your choice: ");
        return new Validation().getInt();
    }
    
}
//                int[] arrayToSort = Elements.getArray();
//                System.out.println("Array before sorting: ");
//                Elements.display();
//                bubbleSort(arrayToSort);
//                System.out.println("\nArray after sorting: ");
//                displayArray(arrayToSort);
//                int[] arrayToSort1 = Elements.getArray();
//                System.out.println("Array before sorting: ");
//                Elements.display();
//                
//                quickSort(arrayToSort1,0,arrayToSort1.length - 1);
//                System.out.println("\nArray after sorting: ");
//                displayArray(arrayToSort);