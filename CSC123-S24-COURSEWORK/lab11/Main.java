
public class Main {
    public static void main(String[] args) {
        HashMap<String, Currency> currencyMap = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("currencies.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                String code = parts[0];
                String name = parts[1];
                double rate = Double.parseDouble(parts[2]);
                Currency currency = new Currency(code, name, rate);
                currencyMap.put(code, currency);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the currencies from the HashMap
        for (Currency currency : currencyMap.values()) {
            System.out.println(currency);
        }
    }
}