package pk5;


class Device {

    static int count = 0;

    int price = 100;
    String name = "Unnamed";

    static {
        count += 2;
        System.out.println("Static block: " + count);
    }

    {
        price += 50;
        count++;

        System.out.println(
                "Instance block: " + price + ", " + count
        );
    }

    Device() {
        this("Basic", 300);

        System.out.println(
                "No-arg constructor: " + name + ", " + price
        );
    }

    Device(String name, int price) {
        this.name = name;
        this.price = price;
        count += 2;

        System.out.println(
                "Parameterized constructor: "
                        + name + ", " + price + ", " + count
        );
    }

    void show() {
        System.out.println(name + " : " + price + " : " + count);
    }
}
