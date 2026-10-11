package pk6;
class Library {

    private int books = 10;

    static int issued = 3;

    void addBooks(int amount) {
        books += amount;
    }

    void addBooks(double amount) {
        books += (int) amount;
    }

    static void showStats(Library lib) {
        System.out.println("Issued: " + issued);
        System.out.println("Books: " + lib.books);

      //  System.out.println("Books: " + books); // static can only access static members directly .Here books is a private member


    }

    void showBooks() {
        System.out.println("Books: " + books);
    }
}
