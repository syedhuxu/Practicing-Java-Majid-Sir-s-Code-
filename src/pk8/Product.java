package pk8;

class Product {

    String name;
    double price;

    Product() {
        this("Unknown");

        System.out.println("No-argument constructor");
    }

    Product(String name) {
        this(name, 0.0);

        System.out.println("One-argument constructor");
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;

        System.out.println("Two-argument constructor");
    }

    void display() {
        System.out.println(name + " : " + price);
    }
}
