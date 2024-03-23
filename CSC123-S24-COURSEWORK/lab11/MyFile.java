
import java.io.*;

public class MyFile {
    private File file;

    public MyFile(String fileName) throws IOException {
        this.file = new File(fileName);

        if (!file.exists()) {
            throw new IOException("File not found");
        }

        if (!file.isFile()) {
            throw new IOException("Not a file");
        }

        if (!file.canRead()) {
            throw new IOException("File not readable");
        }
    }

    @Override
    public String toString() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void main(String[] args) {
        try {
            MyFile myFile = new MyFile("example.txt");
            System.out.println(myFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
