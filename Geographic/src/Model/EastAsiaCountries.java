package Model;

public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries> {

    public String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Country terrain: "+ countryTerrain);
    }
    @Override
    public int compareTo(EastAsiaCountries other) {
        return this.getCountryName().compareToIgnoreCase(other.getCountryName());
    }
}
