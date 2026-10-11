package pk8;

class Account {

    public String owner = "Aman";

    protected double balance = 5000;

    int branchCode = 101; // Package-private (default)
    private int pin = 1234;

    public int getPin() {
        return pin; // getter
    }

    private void verifyPin() {
        System.out.println("Verifying PIN");
    }

    public void checkAccount() {
        verifyPin();
        System.out.println(pin);
    }
}
