import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int real = num;
        int y= 0;
        while(num>0)
        {
            int x = (num)%10;
            y = (y*10)+x;
            num = num/10;
        }
        if(real == y)
        {
            System.out.println("Given Number is Palindrome");
        }
        else{
            System.out.println("Given Number is not Palindrome");
        }
        sc.close();
    }
}
