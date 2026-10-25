package pk16;

public class Test6 {
    void process(Base b) {
        System.out.println("Base called");
    }
    void process(Derived d) {
        System.out.println("Derived called");
    }
    void process(Object o) {
        System.out.println("Object called");
    }

    public static void main(String[] args) {
        Test6 test = new Test6();
        Base b = new Derived();
        test.process(b);
        test.process((Derived) b);
        test.process(null);
    }
}
