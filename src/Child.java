class Child extends Parent {
    int value = 20;

    Child() {
        printValue();
    }

    @Override
    void printValue() {
        System.out.print("C:" + value + " ");
    }
}