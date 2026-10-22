package pk15;
public class Main3 {
    static int calculate() {
        try {
            System.out.println("Try");
            return 10;
        } catch (Exception e) {
            System.out.println("Catch");
            return 20;
        } finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        int result = calculate();
        System.out.println(result);
    }
}