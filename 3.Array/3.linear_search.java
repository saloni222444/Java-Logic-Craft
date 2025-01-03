// This Java program performs a linear search to find a specific value (key) in an array.

// linearSearch Method: Iterates through the array to check if the key exists.

// Returns the index of the key if found.
// Returns -1 if the key is not found.
// main Method:

// Initializes an array and a key value.
// Calls linearSearch to find the key.
// Prints "Key is at index: x" if found, or "Not Found" otherwise.

import java.util.*;

public class 3.linear_search {

    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i; // Return index if key is found
            }
        }
        return -1; // Return -1 if key is not found after checking all elements
    }

    public static void main(String args[]) {
        int number[] = {1, 2, 3, 4, 5, 6, 7};
        int key = 8;

        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
