package pk20;

public class GarbageCollection {
    static void main(String[] args) {
        GarbageCollection gc = new GarbageCollection();
        System.out.println(gc);
        gc = null;
        System.gc();
        System.out.println(gc);
    }
}
