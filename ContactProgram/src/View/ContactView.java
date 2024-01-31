package View;

import Controller.Manager;
import Model.Contact;
import View.Menu;
import java.util.ArrayList;
import java.util.List;

public class ContactView extends Menu {

    private Manager mg;
    private List<Contact> list = new ArrayList<>();
    private Contact contact = new Contact();

    public ContactView(){
        super(new String[]{"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"});
        mg = new Manager(list);
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                System.out.println("-------------- Add a Contact --------------");
                mg.addContact(list, contact);
                break;
            case 2:
                mg.displayAll(list);
                break;
            case 3:
                System.out.println("-------------- Delete a Contact --------------");
                mg.deleteContact(list, contact);
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
