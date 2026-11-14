package pk20;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program started...");

        try {

            int numerator = 10;
            int denominator = 5;

            int result = numerator / denominator;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error caught: You cannot divide a number by zero!");

        } finally {
            System.out.println("Finally block: Cleaning up resources.");
        }

        System.out.println("Program finished smoothly!");
    }
}
