//factorial logic: multiplies a positive integer by all the positive integers less than it//
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // Store user input
        int factorial = 1;  // Initialize the factorial variable to 1

        // Logic for calculating factorial
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;  // Multiply each number from 1 to the input number
        }

        // Display the result
        System.out.println("Factorial of " + number + " is: " + factorial);  // Output the factorial result

        sc.close();  // Close the scanner to avoid resource leak
    }
}
