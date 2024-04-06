//treasure warren (twarren24@toromail.csudh.edu)

import java.util.*;

public class MyScanner {
    private String input;
    private String[] tokens;
    private int index;

    public MyScanner(String string) {
        if (string != null && !string.equals("")) {
            input = string;
            tokens = input.trim().split("\\s+");
        } else {
            input = "";
            tokens = new String[0];
        }
        index = 0;
    }
    // Check if there are more tokens available
    public boolean hasNext() {
        return index < tokens.length;
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return tokens[index++];
    }

    public boolean hasNextInt() {
        if (!hasNext()) {
            return false;
        }
        try {
            Integer.parseInt(tokens[index]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (!hasNextInt()) {
            throw new InputMismatchException();
        }
        int number = Integer.parseInt(tokens[index]);
        index++;
        return number;
    }

    public boolean hasNextDouble() {
        if (!hasNext()) {
            return false;
        }
        try {
            Double.parseDouble(tokens[index]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public double nextDouble() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (!hasNextDouble()) {
            throw new InputMismatchException();
        }
        double number = Double.parseDouble(tokens[index]);
        index++;
        return number;
    }

    public boolean hasNextLong() {
        if (!hasNext()) {
            return false;
        }
        try {
            Long.parseLong(tokens[index]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (!hasNextLong()) {
            throw new InputMismatchException();
        }
        long number = Long.parseLong(tokens[index]);
        index++;
        return number;
    }

    public boolean hasNextShort() {
        if (!hasNext()) {
            return false;
        }
        try {
            Short.parseShort(tokens[index]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public short nextShort() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (!hasNextShort()) {
            throw new InputMismatchException();
        }
        short number = Short.parseShort(tokens[index]);
        index++;
        return number;
    }

    public boolean hasNextByte() {
        if (!hasNext()) {
            return false;
        }
        try {
            Byte.parseByte(tokens[index]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public byte nextByte() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (!hasNextByte()) {
            throw new InputMismatchException();
        }
        byte number = Byte.parseByte(tokens[index]);
        index++;
        return number;
    }
    // Check if the next token is a double
    public boolean hasNextBoolean() {
        if (!hasNext()) {
            return false;
        }
        String token = tokens[index];
        return token.equalsIgnoreCase("true") || token.equalsIgnoreCase("false");
    }
    // Get the next double token
    public boolean nextBoolean() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (!hasNextBoolean()) {
            throw new InputMismatchException();
        }
        boolean bool = Boolean.parseBoolean(tokens[index]);
        index++;
        return bool;
    }
 // Set the delimiter pattern to split the input string
    public void useDelimiter(String pattern) {
        tokens = input.split(pattern);
        index = 0;
    }
 // Check if the next token is a float
    public boolean hasNextFloat() {
        if (!hasNext()) {
            return false;
        }
        try {
            Float.parseFloat(tokens[index]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
 // Get the next float token
    public float nextFloat() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (!hasNextFloat()) {
            throw new InputMismatchException();
        }
        float number = Float.parseFloat(tokens[index]);
        index++;
        return number;
    }
}

