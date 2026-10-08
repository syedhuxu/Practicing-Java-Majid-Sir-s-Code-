package pk1;

public class Counter {

    static int total = 10;

    int value = 5;

    static {
        total += 2;
        System.out.println("Static block: " + total); // 12
    }

    {
        value += 3;
        System.out.println("Instance block: " + value); // 8
    }

    Counter() {
        this(4); // junps to parameterized constructor...
        System.out.println("Default constructor: " + value); // 4
    }

    Counter(int value) {
        this.value = value; // 4 // 6
        total += value; // 12 + 4 = 16  // 22
        System.out.println("Parameterized constructor: " + this.value); // 4 //6
    }

    void show() {
        System.out.println("show(): " + value + " : " + total); // 4 16 //6 22
    }

    void show(int value) {
        System.out.println("show(int): " + this.value + " : " + value + " : " + total);  // 4 20 16
    }
}

