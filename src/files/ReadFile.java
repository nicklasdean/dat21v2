package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        //Create a File object with reference to a file
        File countriesFile = new File("resources/countries.csv");

        //Create a Scanner to scan the object representation of the file
        Scanner fileScanner = new Scanner(countriesFile);

        //ArrayList that contains countries
        ArrayList<Country> allCountries = new ArrayList<Country>();

        //Skipping a line
        fileScanner.nextLine();

        //While scanner has input (That implements iterator)
        while(fileScanner.hasNextLine()){
            //1. Print each line of the file
            String currentLine = fileScanner.nextLine();
            //System.out.println(currentLine);
            //2. Make object of each entity
            String[] lineAsArray = currentLine.split(";");
//          lineAsArray = [ [0]5, [1]Belgien, [2]11626404 ]
            int id = Integer.parseInt(lineAsArray[0].trim());
            String countryName = lineAsArray[1].trim();
            int population = Integer.parseInt(lineAsArray[2].trim());

            Country tmpCountry = new Country(id,countryName,population);
            allCountries.add(tmpCountry);
        }

        System.out.println(findLargestPopulation(allCountries));
    }

    public static String findLargestPopulation(ArrayList<Country> countryList){
        int maxPopulation = countryList.get(0).getPopulation();
        String countryWithLargestPopulation = countryList.get(0).getCountryName();

        for (int i = 1; i < countryList.size(); i++) {
            if(countryList.get(i).getPopulation() > maxPopulation){
                maxPopulation = countryList.get(i).getPopulation();
                countryWithLargestPopulation = countryList.get(i).getCountryName();
            }
        }

        return countryWithLargestPopulation;
    }
}
