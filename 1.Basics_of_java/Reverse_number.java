//Reversing a number in Java involves reversing the digits of a given number. For example, if the input number is 12345, the output will be 54321. //

import java.util.Scanner;

public class ReverseNumber {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();  
        int rn = 0;

        while (num != 0) {
            int digit = num % 10;  
            rn = rn * 10 + digit;  
            num /= 10;  
        }

        System.out.println("Reversed number: " + rn);  
        sc.close();  
    }
}
