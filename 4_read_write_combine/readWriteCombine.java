import java.io.File;
  import java.util.Scanner;
 
  import java.io.PrintWriter;
import java.util.*;

 public class ReadFileExample {
 public static void main(String[] args) throws Exception {
  // Create a File object
  File file = new File("main.dart");
  
 // Create a Scanner object for the file
 Scanner scanner = new Scanner(file);
 
// Read the contents of the file
// and use ArrayList Data structure to store
List<String> linesOfFile = new ArrayList<>();
while (scanner.hasNextLine()) {
String line = scanner.nextLine();
linesOfFile.add(line);
// System.out.println(line);
 }
 
// Close the Scanner object
scanner.close();


// eklemenin eklenmesi
//
int atLine = findTheLineNumber(linesOfFile , "void main()");
// exist check
if(atLine !=0 && isAlreadyExist(linesOfFile.get(atLine -1), "hahaha" ) != true) linesOfFile.add(atLine, "hahaha");
// yazma baslangici
//

// Create a File object
//File file = new File("filename.txt");

// Create a PrintWriter object for the file
PrintWriter writer = new PrintWriter(file);

// Write to the file
//writer.println("Hello, World!");
//writer.println("This is a test.");
for(String l : linesOfFile){

	writer.println(l);
}


 // Close the PrintWriter object
 writer.close();

 }
 private static int findTheLineNumber(List<String> targetList, String searchString){
int index =-1;

	 //for(String targetString : targetList){
for(int i =0 ; i< targetList.size();i++){
	 

	// Check if the target string contains the search string
    if (targetList.get(i).contains(searchString)) {
      System.out.println("Match found at the line: " + i );
      index = i;
      return index;
    } 
}
      System.out.println("Match not found.");



    return index;
 }



 private static boolean isAlreadyExist(String target, String insertString){
	if(target.equals(insertString)) return true;

	return false;

 }
  
}
