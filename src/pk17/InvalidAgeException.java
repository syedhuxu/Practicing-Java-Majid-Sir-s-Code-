package pk17;

// We extend Exception to make this a Checked exception
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        // Passes the message to Java's built-in exception system
        super(message);
    }
}
