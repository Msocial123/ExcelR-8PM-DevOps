import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Add the numbers
        double sum = num1 + num2;
        
        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
