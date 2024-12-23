// fabinacci_series logic is a sequence of numbers where each number is the sum of the two preceding ones, typically starting with 0 and 1. eg: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. //


public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + ", " + b);

        for (int i = 3; i <= n; i++) {
            int nextNumber = a + b;
            System.out.print(", " + nextNumber);
            a = b;
            b = nextNumber;
        }
    }
}
