import java.io.File;
import java.util.Scanner;

public class ReadFileExample {
  public static void main(String[] args) throws Exception {
    // Create a File object
    File file = new File("main.dart");

    // Create a Scanner object for the file
    Scanner scanner = new Scanner(file);

    // Read the contents of the file
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      System.out.println(line);
    }

    // Close the Scanner object
    scanner.close();
  }
}

