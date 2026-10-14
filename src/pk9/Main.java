package pk9;

public class Main {
    public static void main(String[] args) {
        Base b = new Derived();
        b.printId();
        System.out.print(b.ID);
    }
}
