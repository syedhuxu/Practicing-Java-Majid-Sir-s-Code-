package pk2;

class Child extends Parent {

    int value = 20;

    static String name = "Child";

    @Override
    void show() {
        System.out.println("Child show: " + value); //20
        System.out.println("Parent value: " + super.value); //10
    }

    static void kind() {
        System.out.println("Child kind");
    }

    @Override
    void fixed() {
        System.out.println("Child fixed");
    }
}
