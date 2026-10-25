package pk16;

public class Test1 {
    public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;

        int x = 5;
        int y = 9;
        System.out.println(d);
        System.out.println((x ^ y) + " " + (x & y) + " " + (~x));
    }
}