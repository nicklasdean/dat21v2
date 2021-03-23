package files;

//Data model for country
public class Country {
    private int id;
    private String countryName;
    private int population;

    public Country(int id, String countryName, int population){
        this.id = id;
        this.countryName = countryName;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getPopulation() {
        return population;
    }
}
