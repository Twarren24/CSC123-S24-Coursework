
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {
        String highestBirthRateCountry = "", highestPopulationCountry = "", smallestAreaCountry = "";
        double highestBirthRate = 0.0, highestPopulation = 0.0, smallestArea = Double.MAX_VALUE;
        double totalPopulation = 0.0, totalArea = 0.0;

        try (BufferedReader br = new BufferedReader(new FileReader(new File("\\Users\\harol\\OneDrive\\Documents\\world_factbook.csv")))) {
            br.readLine(); // 
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length < 4) continue;

                try {
                    double birthRate = Double.parseDouble(fields[3]);
                    double population = Double.parseDouble(fields[1]);
                    double area = Double.parseDouble(fields[2]);

                    if (birthRate > highestBirthRate) {
                        highestBirthRate = birthRate;
                        highestBirthRateCountry = fields[0];
                    }

                    if (population > highestPopulation) {
                        highestPopulation = population;
                        highestPopulationCountry = fields[0];
                    }

                    if (area < smallestArea) {
                        smallestArea = area;
                        smallestAreaCountry = fields[0];
                    }

                    totalPopulation += population;
                    totalArea += area;
                } catch (NumberFormatException e) {
                   
                    continue;
                }
            }

            double averageBirthRate = totalPopulation / 264;

            System.out.println("Highest birth rate: " + highestBirthRateCountry);
            System.out.println("Highest population: " + highestPopulationCountry);
            System.out.println("Smallest area: " + smallestAreaCountry);
            System.out.println("Total population: " + totalPopulation);
            System.out.println("Average birth rate: " + averageBirthRate);
            System.out.println("Total area: " + totalArea);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








        		
        		
        	