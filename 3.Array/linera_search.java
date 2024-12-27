import java.util.*;

public class linear_search {

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
