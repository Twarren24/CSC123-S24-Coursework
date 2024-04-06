//treasure warren (twarren24@toromail.csudh.edu) CSUDH
public class ScannerTest {

    public static void main(String[] args) {
        // Test string with different types of data
        String s = "apple 123 3.14 true banana -456 7.89 false orange";

        // Create a scanner to read the test string
        MyScanner input = new MyScanner(s);

        // Loop to read and print different types of data
        while (input.hasNext()) {
            if (input.hasNextInt()) {
                System.out.println("Integer found: " + input.nextInt());
            } else if (input.hasNextByte()) {
                System.out.println("Byte found: " + input.nextByte());
            } else if (input.hasNextLong()) {
                System.out.println("Long found: " + input.nextLong());
            } else if (input.hasNextShort()) {
                System.out.println("Short found: " + input.nextShort());
            } else if (input.hasNextDouble()) {
                System.out.println("Double found: " + input.nextDouble());
            } else if (input.hasNextFloat()) {
                System.out.println("Float found: " + input.nextFloat());
            } else if (input.hasNextBoolean()) {
                System.out.println("Boolean found: " + input.nextBoolean());
            } else if (input.hasNext()) {
                System.out.println("String found: " + input.next());
            }
        }

        // Print a delimiter to separate sections
        System.out.println("Delimiter--------");

        // Use delimiter to split the string
        input.useDelimiter(":");
        while (input.hasNext()) {
            System.out.println(input.next());
        }
    }
}
