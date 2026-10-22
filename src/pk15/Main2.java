package pk15;
public class Main2 {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array");
        } catch (Exception e) {
            System.out.println("General");
        } finally {
            System.out.println("Finally");
        }
    }
}