package pk5;
public class Snippet2 {
    public static void main(String[] args) {

        int a = 4;

        int b = a++ + ++a;

        int c = b-- - a++;

        double d = 9 / 2 + 9 / 2.0; // 9/2 = 4 9/2.0 = 9.0/2.0 = 4.5 (so 4 + 4.5 = 8.5)

        int e = 5;
        e += 2.7;

        char ch = 'C';

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println(ch + 2);
        System.out.println((char) (ch + 2));

        System.out.println(++a + a++);
        System.out.println("Final a = " + a);
    }
}