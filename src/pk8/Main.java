package pk8;

public class Main {
    public static void main(String[] args) {
        Base obj = new Derived(); // Base  is the reference type and Derived is the type of object
        System.out.println("Final Value: " + obj.value);
    }
}