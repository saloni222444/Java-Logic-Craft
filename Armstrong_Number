///
An Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits.
For example:
153 is an Armstrong number///




iimport java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {
        // Prompt the user to enter a number
        System.out.print("Enter a number to check: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // Store user input
        int backup = num;  // Store the original number for comparison later
        int sum = 0;  // Initialize sum to calculate Armstrong number

        // Logic to calculate the sum of cubes of digits
        while (num > 0) {
            int digit = num % 10;  // Extract the last digit of the number
            sum = sum + (digit * digit * digit);  // Add the cube of the digit to sum
            num = num / 10;  // Remove the last digit from the number
        }

        // Check if the sum of cubes equals the original number
        if (sum == backup) {
            System.out.println(backup + " is an Armstrong number.");  // If true, it's an Armstrong number
        } else {
            System.out.println(backup + " is not an Armstrong number.");  // If false, it's not an Armstrong number
        }

        sc.close();  // Close the scanner to avoid resource leak
    }
}
