package pk16;

class SubClass extends SuperClass {
    int x = 20; // Hiding / Shadowing
    void show() {
        System.out.println("Sub show: " + x);
    }
}