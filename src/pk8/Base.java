package pk8;

abstract class Base {
    int value = 10;

    Base() {
        printValue();
    }

    abstract void printValue();
}
