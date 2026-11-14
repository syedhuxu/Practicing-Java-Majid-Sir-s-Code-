package pk20;

public class CustomExceptionDemo {

    static void withdraw(double balance, double amount) throws InsufficientFundsException {
        System.out.println("Attempting to withdraw: $" + amount);

        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientFundsException(
                    "Transaction failed! You are short by $" + shortfall
            );
        }

        double remaining = balance - amount;
        System.out.println("Success! Remaining balance: $" + remaining);
    }

    public static void main(String[] args) {
        double myBalance = 500.00;

        try {
            withdraw(myBalance, 200.00);

            System.out.println("---");

            withdraw(myBalance, 650.00);

        } catch (InsufficientFundsException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}