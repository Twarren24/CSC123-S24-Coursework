
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyScanner {
    private BufferedReader reader;

    public MyScanner(String fileName) throws IOException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public String next() throws IOException {
        return reader.readLine();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(reader.readLine());
    }

    public boolean hasNext() throws IOException {
        return reader.ready();
    }

    public void close() throws IOException {
        reader.close();
    }
}
