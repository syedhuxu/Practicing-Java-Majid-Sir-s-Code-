package pk15;
public class Main5 {
    static void first() {
        System.out.println("1");

        try {
            second();
        } catch (ArithmeticException e) {
            System.out.println("2");
        } finally {
            System.out.println("3");
        }

        System.out.println("4");
    }

    static void second() {
        System.out.println("5");
        int result = 10 / 0;
        System.out.println("6");
    }

    public static void main(String[] args) {
        try {
            first();
        } catch (Exception e) {
            System.out.println("7");
        }

        System.out.println("8");
    }
}
