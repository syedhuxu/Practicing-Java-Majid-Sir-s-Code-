package pk20;

public class ThrowDemo {

    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Access denied: Age must be 18 or older.");
        } else {
            System.out.println("Access granted: Welcome!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Checking first user (Age 20)...");
        checkAge(20);

        System.out.println("\nChecking second user (Age 15)...");

        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught -> " + e.getMessage());
        }

        System.out.println("\nProgram continues smoothly.");
    }
}