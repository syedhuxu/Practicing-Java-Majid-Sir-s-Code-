package pk17;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        // The compiler sees this and says: "What if 'data.txt' doesn't exist?"
        // It FORCES you to wrap this in a try-catch block.
        try {
            FileReader file = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("The file is missing! Please check the folder.");
        }
    }
}
