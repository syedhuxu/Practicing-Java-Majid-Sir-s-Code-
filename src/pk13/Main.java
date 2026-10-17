package pk13;

public class Main {
    public static void main(String[] args) {
        Worker w = new Manager();
        w.process();
        ((Manager) w).log();
    }
}