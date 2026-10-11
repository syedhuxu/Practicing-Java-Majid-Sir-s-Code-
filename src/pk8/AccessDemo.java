package pk8;
public class AccessDemo {

    public static void main(String[] args) {

        Account account = new Account();

        System.out.println(account.owner);
        System.out.println(account.balance);
        System.out.println(account.branchCode);

        System.out.println(account.getPin());

        account.checkAccount();

        // System.out.println(account.pin);
       //  account.verifyPin();
        // Both are inaccessible here because they are private.
    }
}