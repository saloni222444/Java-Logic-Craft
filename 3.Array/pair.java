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