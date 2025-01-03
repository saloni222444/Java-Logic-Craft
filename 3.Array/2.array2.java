//Passing array as argument 
// their have two methods (1.pass by value 2.pass by reference)
import java.util.*;

public class 2array2{
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }

    public static void main(int marks[]){
        int marks[] = {97,98,99};
        update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]+"");
        }
        System.out.println();
    }
}