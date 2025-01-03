
// This program finds the largest and smallest numbers in an array, prints the smallest, and returns the largest.
public class 4.largest_num{
    public static int get_largest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length; i++){
              if(largest < number[i]){
                  largest = number[i];
              }
              if(smallest> number[i]) 
              {
                smallest = number[i];
              }
        }
        System.out.println("smallest number is "+smallest);
        return largest;
    }
    public static void main (String args[]){
        int number[] = {1,4,2,7,9,4,2,5};
        System.out.println("largest number is:" +get_largest(number)); 
    }
}
