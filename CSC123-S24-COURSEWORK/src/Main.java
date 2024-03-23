
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Currency {
    private String code;
    private String name;
    private double rate;

    public Currency(String code, String name, double rate) {
        this.code = code;
        this.name = name;
        this.rate = rate;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Currency> currencies = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("currencies.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                String code = parts[0];
                String name = parts[1];
                double rate = Double.parseDouble(parts[2]);
                currencies.add(new Currency(code, name, rate));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the currencies
        for (Currency currency : currencies) {
            System.out.println(currency.getCode() + ": " + currency.getName() + " - Rate: " + currency.getRate());
        }
    }
}
