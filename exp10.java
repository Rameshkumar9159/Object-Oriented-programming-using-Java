import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class exp10 {
public static void main(String[] args) {
String fileName = "example.txt";
String filePath = "/home/rameshchlm/Documents/exp10_folder";
createFile(fileName, filePath);
writeFile(fileName, filePath, "Hello, World!");
String content = readFile(fileName, filePath);
System.out.println("Content read from the file: " + content);
deleteFile(fileName, filePath);
}
public static void createFile(String fileName, String filePath) {
try {
File file = new File(filePath + fileName);
if (file.createNewFile()) {
System.out.println("File created: " + file.getName());
System.out.println("Absolute Path: " + file.getAbsolutePath());
} else {
System.out.println("File already exists.");
}
} catch (IOException e) {
System.out.println("An error occurred while creating the file.");e.printStackTrace();
}
}
public static void writeFile(String fileName, String filePath, String content) {
try {
FileWriter writer = new FileWriter(filePath + fileName);
writer.write(content);
writer.close();
System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
System.out.println("An error occurred while writing to the file.");
e.printStackTrace();
}
}
public static String readFile(String fileName, String filePath) {
StringBuilder content = new StringBuilder();
try {
FileReader reader = new FileReader(filePath + fileName);
int character;
while ((character = reader.read()) != -1) {
content.append((char) character);
}
reader.close();
} catch (IOException e) {
System.out.println("An error occurred while reading the file.");
e.printStackTrace();
}
return content.toString();}
public static void deleteFile(String fileName, String filePath) {
File file = new File(filePath + fileName);
if (file.delete()) {
System.out.println("File deleted successfully.");
} else {
System.out.println("Failed to delete the file.");
}
}
}
