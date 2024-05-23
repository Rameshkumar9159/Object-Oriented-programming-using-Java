public class exp06 {
public static void main(String[] args) {
String str1 = "Hello";
String str2 = "World";
String result = str1 + " " + str2;
System.out.println("Concatenated String: " + result);
int length = result.length();
System.out.println("Length of String: " + length);String sub = result.substring(0, 5);
System.out.println("Substring: " + sub);
String upperCase = result.toUpperCase();
System.out.println("Uppercase: " + upperCase);
String lowerCase = result.toLowerCase();
System.out.println("Lowercase: " + lowerCase);
String replaced = result.replace('o', 'x');
System.out.println("Replaced String: " + replaced);
}
}
