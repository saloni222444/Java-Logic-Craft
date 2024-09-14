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
