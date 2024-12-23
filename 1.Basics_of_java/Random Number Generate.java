//Random Number Generation in Java: It’s a way to produce a number that is not predictable.
Using java.util.Random: You create an object to help you generate random numbers. You can ask it to give you an integer, a floating-point number, etc., all within a range you specify.
Using Math.random(): A built-in method that gives you a random number between 0.0 and 1.0. You can adjust this to get numbers in other ranges.//



public class RandomNumberExample {
    public static void main(String[] args) {
        // Generate a random double between 0.0 and 1.0
        double randomDouble = Math.random();

        // Generate a random integer between 0 and 99
        int randomInt = (int) (Math.random() * 100);

        // Print the results
        System.out.println("Random Integer: " + randomInt);
        System.out.println("Random Double: " + randomDouble);
    }
}
