package pk7;

public class AbstractDemo {

    public static void main(String[] args) {

        // Appliance a = new Appliance("ABC"); // Cannot instantiate ( means we can't create an object of an abstract class

        Fan f = new Fan("Orient");

        f.showBrand();
        f.turnOn();
    }
}