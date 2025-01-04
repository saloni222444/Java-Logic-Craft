
public class max_subarray_sum{
    public static void MAX_SUM(int number[]){
        // int currsum = 0;
         int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            int start=i;
            for(int j=i; j<number.length; j++){
            int end = j;
            int currsum = 0;
            //  int maxsum = Integer.MIN_VALUE;
            System.out.print("subarray is : ");
            for(int k=start; k<=end; k++){
                  System.out.print("("+number[k]+")"+" ");
                  currsum += number[k];
              }
              System.out.print("and sum is : ");
              System.out.println(currsum);
              if(maxsum <= currsum){
                maxsum = currsum;
            }
           }
        }
        System.out.println("max sum is :" +maxsum);
        System.out.println();
    }    
    public static void main(String args[]){
        int number[] = {1, -3, 5, 8, -2};
        MAX_SUM(number);
    }
}