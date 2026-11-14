package pk20;
import java.io.IOException;

public class CatchOrSpecifyDemo {


    static void readFromFile(boolean fileExists) throws IOException {
        if (!fileExists) {
            throw new IOException("config.txt was not found on disk.");
        }
        System.out.println("File read successfully!");
    }

    static void backupFile() {
        try {
            throw new IOException("Backup drive is disconnected.");
        } catch (IOException e) {
            System.out.println("[Handled inside backupFile] Error: " + e.getMessage());
        }
    }


    //static void brokenMethod() {
    //    throw new IOException("Unhandled checked exception!");
   // }


    public static void main(String[] args) {
        System.out.println("1. Testing the CATCH approach:");
        backupFile();

        System.out.println("\n2. Testing the SPECIFY approach:");

        try {
            readFromFile(false);
        } catch (IOException e) {
            System.out.println("[Caught in main] Error: " + e.getMessage());
        }

        System.out.println("\nProgram completed normally.");
    }
}