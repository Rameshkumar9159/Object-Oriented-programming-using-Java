import java.util.Scanner;
public class exp07 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.println("Enter a number:");
int num = scanner.nextInt();
System.out.println("You entered: " + num);
} catch (Exception e) {
System.out.println("Error: Input must be a valid integer.");} finally {
scanner.close();
}
}
}
