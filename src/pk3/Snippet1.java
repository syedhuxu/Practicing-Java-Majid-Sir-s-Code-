package pk3;
public class Snippet1 {

    public static void main(String[] args) {

        int a = 10;
        double b = 3.5;
        char ch = 'B';

        double result = a + b * 2; //17.0

        int converted = (int) result; //17

        boolean condition = converted > 15 && ch > 'A'; //true

        System.out.println(result); //17.0
        System.out.println(converted); //17
        System.out.println(ch + 3); //69
        System.out.println(condition); //true

        if (condition) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }

        int x = 5;
        int y = 2;

        System.out.println(x / y); //2
        System.out.println((double) x / y); //2.5
    }
}