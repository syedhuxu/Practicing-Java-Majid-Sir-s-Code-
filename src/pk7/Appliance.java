package pk7;

abstract class Appliance {

    String brand;

    Appliance(String brand) {
        this.brand = brand;
    }

    abstract void turnOn();

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

