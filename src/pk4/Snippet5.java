package pk4;

public class Snippet5 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        //  System.out.println(account.owner);  can't access private members

       // System.out.println(account.balance);

        account.deposit(500);
        account.deposit(250.5);

        account.showOwner();

        account.showBankCode();

        System.out.println(account.balance);

        System.out.println(account.accountNumber);
    }
}
