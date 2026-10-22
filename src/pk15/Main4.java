package pk15;
public class Main4 {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Not eligible");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {

            checkAge(16);
            System.out.println("After method"); // chale ga hi nhi  kyu ki jahan pe exception hota hai uss k neeche wali lines unreachable hoti hai
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}