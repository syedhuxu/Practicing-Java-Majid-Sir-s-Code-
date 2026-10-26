
public class Test8 {
    public static int execute() {
        try {
            int[] arr = new int[2];
            int res = 10 / 0; // ArithmeticException
            return arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("AIOOBE ");
            return 1;
        } catch (ArithmeticException e) {
            System.out.print("AE ");
            throw new RuntimeException("Rethrown");
        } finally {
            System.out.print("FINALLY ");
            return 42;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result=" + execute());
    }
}