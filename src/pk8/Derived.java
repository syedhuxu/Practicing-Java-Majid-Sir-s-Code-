package pk8;

class Derived extends Base {
    int value = 20;

    {
        value = 30;
    }

    Derived() {
        // implicit call to base class constructor .

        value = 40;
    }

    @Override
    void printValue() {
        System.out.println("Value: " + value); //0 because the control is still in base class
    }
}