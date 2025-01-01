// This Java program implements binary search to find the index of a given key in a sorted array. 
// It iteratively narrows down the search range and returns the index if the key is found or -1 if not. There's a typo in the method name binery_search which should be corrected.

import java.util.*;

public class binary_search{
    public static int binery_search(int number[], int key){
        int start =0, end = number.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){//right
                start = mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        System.out.println("Index for key is: "+binery_search(number,key));
    }
}
