package pk7;

class Fan extends Appliance {

    Fan(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println("Fan is running");
    }
}