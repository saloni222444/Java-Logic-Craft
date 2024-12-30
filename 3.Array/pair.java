//
//This Java program prints all possible pairs of numbers from an array and counts the total number of pairs.
//get_pair Method: Loops through the array to form and print pairs, then counts them.
//main Method: Initializes an array and calls get_pair to process it.
//For {2, 4, 3, 6, 7}, the output includes all pairs like (2,4), (2,3), etc., and the total count of pairs.


import java.util.*;

public class pair{
    public static void get_pair(int number[]){
        int total_pair = 0;
        for(int i=0; i<number.length; i++){
            int current = number[i];
            for(int j=i+1; j<number.length; j++){
                System.out.print("(" + current + "," + number[j] + ")");
                total_pair ++;
            }
            System.out.println();
        }
          System.out.println("total number of pairs:" +total_pair);
    }
    public static void main(String args[]){
        int number[] = {2, 4, 3, 6, 7};
        get_pair(number);
    }
}
