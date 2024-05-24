import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class exp04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        // Addition
        System.out.println("Addition of two numbers: " + Math.addExact(num1, num2));

        // Subtraction
        System.out.println("Subtraction of two numbers: " + Math.subtractExact(num1, num2));

        // Multiplication
        System.out.println("Multiplication of two numbers: " + Math.multiplyExact(num1, num2));

        // Division (Handled division separately to avoid ArithmeticException for division by zero)
        if (num1 != 0 && num2 !=0) {
            System.out.println("Division of two numbers: " + (double) num1 / num2);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

