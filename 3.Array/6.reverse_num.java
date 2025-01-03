//This Java program reverses the elements of an array.

//reverse Method: Swaps the first and last elements of the array, moving inward, until the entire array is reversed.
//main Method: Initializes an array, calls reverse to reverse it, and then prints the reversed array.
//For the array {1, 4, 3, 20, 3, 8}, the output will be: 8 3 20 3 4 1

import java.util.*;

public class 6.reverse_num{
     public static void reverse(int number[]){
        int first = 0, last = number.length-1;
        while(first < last){
             int temp = number[last];
             number[last] = number[first];
             number[first] = temp;

             first++;
             last--;
        } 
     } 
     public static void main(String args[]){
        int number[] = {1, 4, 3, 20, 3, 8};
        reverse(number);

        for(int i=0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
     }
} 
    

