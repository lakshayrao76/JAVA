import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class SimpleReadWrite {
    public static void main(String[] args) {
        String fileName = "example.txt";  // File name
        String content = "Hello, this is a simple file write and read example in Java.";

        // Write to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("✅ Data written to file successfully!");
        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }

        // Read from file
        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            System.out.println("\n📖 Reading data from file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println(); // new line after reading
        } catch (IOException e) {
            System.out.println("Error while reading from file: " + e.getMessage());
        }
    }
}
