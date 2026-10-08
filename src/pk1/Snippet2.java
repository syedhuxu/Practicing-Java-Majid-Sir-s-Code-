package pk1;

public class Snippet2 {
    public static void main(String[] args) {

        Counter first = new Counter();

        first.show();
        first.show(20);

        Counter second = new Counter(6);
        second.show();

        System.out.println("Final total: " + Counter.total); //22
    }
}
