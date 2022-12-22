import java.io.File;
import java.io.PrintWriter;

public class WriteFileExample {
  public static void main(String[] args) throws Exception {
    // Create a File object
    File file = new File("filename.txt");

    // Create a PrintWriter object for the file
    PrintWriter writer = new PrintWriter(file);

    // Write to the file
    writer.println("Hello, World!");
    writer.println("This is a test.");

    // Close the PrintWriter object
    writer.close();
  }
}

