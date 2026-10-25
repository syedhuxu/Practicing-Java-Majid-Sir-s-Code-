package pk16;

public class Test5 {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        System.out.println("obj.x = " + obj.x); // x parent ka print hoga kyu ki varialbes references k basis pe access hote hai w
        obj.show();
    }
}