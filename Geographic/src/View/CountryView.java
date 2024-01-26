package View;

import Model.Country;
import Controller.CountryController;

import java.util.ArrayList;

public class CountryView extends Menu {

    private ArrayList<Country> countries = new ArrayList<>();
    CountryController a = new CountryController();

    public CountryView() {
        super(new String[]{"Enter information", "Display", "Search", "Display and sort", "Exit"});
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                a.addCountry();
                break;
            case 2:
                a.displayAll();
                break;
            case 3:
                a.search(); 
                break;

            case 4:
                a.displaySortedCountries();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Invalid choice");

                break;
        }
    }
}
