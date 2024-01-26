package Controller;

import Model.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountryController {

    Scanner sc = new Scanner(System.in);
    ArrayList<EastAsiaCountries> countries = new ArrayList<>();

    public void addCountry() {
        EastAsiaCountries a = new EastAsiaCountries();
        System.out.println("Enter country code: ");
        a.setCountryCode(sc.nextLine().toUpperCase());
        System.out.println("Enter country name: ");
        a.setCountryName(sc.nextLine().toUpperCase());
        float totalArea;
        do {
            System.out.println("Enter total area: ");
            totalArea = sc.nextFloat();
        } while (!validations(totalArea));
        a.setTotalArea(totalArea);
        sc.nextLine();
        System.out.println("Enter terrain of country: ");
        a.setCountryTerrain(capitalizeFirstLetter(sc.nextLine()));

        countries.add(a);
        System.out.println("Country has been add.");
    }

    private String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public boolean validations(float totalArea) {
        if (totalArea > 0) {
            return true;
        } else {
            System.out.println("Invalid input, input must be greater than 0.");
            return false;
        }
    }

    public void displayAll() {
        if (countries.isEmpty()) {
            System.out.println("Empty list. Pls try again");
        } else {
            System.out.println("Country's information");
            for (EastAsiaCountries country : countries) {
                System.out.printf("%-10s | %-20s | %-20s | %-20s%n",
                        country.getCountryCode(), country.getCountryName(),
                        country.getTotalArea(), country.getCountryTerrain());
            }
        }
    }

    public void search() {
        ArrayList<EastAsiaCountries> result = new ArrayList<>();
        if (countries.isEmpty()) {
            System.out.println("Empty list. Pls try again");
        } else {
            System.out.println("Enter country name for searching: ");
            String name = sc.nextLine();
            for (EastAsiaCountries country : countries) {
                if (name.toLowerCase().equals(country.getCountryName().toLowerCase())) {
                    System.out.printf("%-10s | %-20s | %-20s | %-20s%",
                            country.getCountryCode(), country.getCountryName(),
                            country.getTotalArea(), country.getCountryTerrain());
                    result.add(country);
                }
            }
        }
    }

    public void displaySortedCountries() {
        try {
            sortCountriesByName();

            System.out.println("Country's information (Sorted by Name in Ascending Order):");
            System.out.printf("%-10s | %-20s | %-20s | %-20s%n", "Country Code", "Country Name", "Total Area", "Terrain");
            System.out.println("------------------------------------------------------------");

            for (EastAsiaCountries country : countries) {
                System.out.printf("%-10s | %-20s | %-20s | %-20s%n",
                        country.getCountryCode(), country.getCountryName(),
                        country.getTotalArea(), country.getCountryTerrain());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sortCountriesByName() throws Exception {
        if (countries.isEmpty()) {
            throw new Exception("No country information available for sorting.");
        }

        Collections.sort(countries);
    }
}
