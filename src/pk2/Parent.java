package pk2;
class Parent {

    protected int value = 10;

    static String name = "Parent";

    void show() {
        System.out.println("Parent show: " + value);
    }

    static void kind() {
        System.out.println("Parent kind");
    }

     void fixed() {
        System.out.println("Parent fixed");
    }
}
