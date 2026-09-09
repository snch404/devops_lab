/**
 * A basic Java program demonstrating classes, methods, and variables.
 */
public class Main {

    // The entry point of any standard Java application
    public static void main(String[] args) {
        // Variable declarations
        String message = "Hello, World!";
        int a = 15;
        int b = 25;

        // Print a simple string
        System.out.println(message);

        // Call a custom method and output the result
        int sum = calculateSum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    /**
     * Helper method that takes two integers and returns their sum.
     */
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
}
