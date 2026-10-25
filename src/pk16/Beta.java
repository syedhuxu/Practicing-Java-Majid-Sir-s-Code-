package pk16;

class Beta extends Alpha {
    static {
        System.out.print("S2 ");
    }
    {
        System.out.print("I2 ");
    }
    Beta() {
        super();
        System.out.print("C2 ");
    }
    public static void main(String[] args) {
        System.out.print("M ");
        new Beta();
        new Beta();
    }
}