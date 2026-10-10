package pk4;
class BankAccount {

    private String owner = "Huxu";

    protected int balance = 5000;

    static int bankCode = 101;

    final   int accountNumber = 999;

    void showOwner() {
        System.out.println(owner);
    }

    void deposit(int amount) {
        balance += amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    public void showBankCode() {
        System.out.println(bankCode);
        System.out.println(balance);
    }

    void changeAccountNumber() {
     //   accountNumber = 1000; can't change final values.
    }
}

