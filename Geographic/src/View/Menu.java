package View;

import Controller.Validation;

import java.util.ArrayList;

public abstract class Menu {
    private ArrayList<String> choices;

    public Menu(String[] choices) {
        this.choices = new ArrayList<>();
        for (String c : choices) {
            this.choices.add(c);
        }
    }

    private void display() {
        System.out.println("--------------------------------------");
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));
        }
        System.out.println("--------------------------------------");
    }

    public void run() {
        while (true) {
            int choice = getSelected();
            if (choice >= 1 && choice <= choices.size()) {
                execute(choice);
            } else if (choice == choices.size() + 1) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("--------------\nTry again!!\n--------------");
            }
        }
    }

    public abstract void execute(int choice);

    public int getSelected() {
        display();
        System.out.print("Enter your choice: ");
        return new Validation().getInt();
    }
}