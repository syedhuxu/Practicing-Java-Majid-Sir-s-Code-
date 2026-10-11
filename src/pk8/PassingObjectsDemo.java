package pk8;
public class PassingObjectsDemo {

    static void modifyBox(Box box) {
        box.value = 50;
    }

    static void replaceParameter(Box box) {
        box = new Box(999); // creates a new object and jo params mai box hai woh uss object ko point karne lga
        box.value = 500;
        System.out.println(box.value);
    }

    static void increaseValue(Box box, int amount) {
        box.value += amount;
    }

    public static void main(String[] args) {

        Box original = new Box(10);

        modifyBox(original);

        System.out.println(original.value); //50

        replaceParameter(original);
        System.out.println(original.value); //50

       increaseValue(original, 20);

      System.out.println(original.value); //70
    }
}