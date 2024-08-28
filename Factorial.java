//factorial logic: multiplies a positive integer by all the positive integers less than it//
import java.util.*;
public class Factorial{
  public static void main(String[] args){
    System.out.print("Enter a number");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int factorial= 1;
    for(int i = 1; i<= number; i++)
      {
           factorial = factorial*i;
      }

  System.out.println("FActorial of " + number + "is: " +factorial);
  }
} 
