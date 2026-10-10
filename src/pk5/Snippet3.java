package pk5;

public class Snippet3 {
    public static void main(String[] args) {

        Device d1 = new Device();

       Device d2 = new Device("Deluxe", 500);

       d1.price += 100;

        d1.show();
       d2.show();

        System.out.println("Total devices: " + Device.count);
    }
}