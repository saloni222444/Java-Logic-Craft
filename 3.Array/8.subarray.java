// The program generates and prints all possible subarrays of a given array.

// Outer Loop: Iterates through the array to set the starting point of the subarray.
// Inner Loop: Iterates to set the ending point of the subarray.
// Innermost Loop: Prints all elements from the start to the end index of the current subarray.
// Example Output for {2, 4, 6, 8, 10}:

// Subarrays: {2}, {2, 4}, {2, 4, 6}, ..., {10}

import java.util.*;
public class subarray{
    public static void Printsubarray(int number[]){
        for(int i=0; i<number.length; i++){
           int start = i;
           for(int j=i; j<number.length; j++){
              int end =  j;
              for(int k=start; k<=end; k++){
                System.out.print(number[k]+" ");
              }
              System.out.println();
            }   
             System.out.println(); 
        }   
    }
     

    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10};
        Printsubarray(number);
    }
}