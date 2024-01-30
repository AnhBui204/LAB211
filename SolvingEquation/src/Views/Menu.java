package Views;

import Controllers.Validation;

public abstract class Menu {
    private String[] choices;
    private String title;

    
    
    public Menu(String[] choices, String title) {
        this.choices = choices;
        this.title = title;
    }

    private void display() {
        System.out.println("========= "+title+" =========");
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
        System.out.println("--------------------------------------");
    }

    public void run() {
        while (true) {
            int choice = getSelected();
            if (choice >= 1 && choice < choices.length) {
                execute(choice);
            } else if (choice == choices.length) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("--------------\nTry again!!\n--------------");
            }
        }
    }

    public abstract void execute(int choice);

    private int getSelected() {
        display();
        System.out.print("Enter your choice: ");
        return new Validation().getInt();
    }
}
