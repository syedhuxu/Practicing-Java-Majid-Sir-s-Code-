package pk6;



public class Snippet5 {
    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBooks(4);
        lib.addBooks(2.9);

      //  System.out.println(lib.books);  can't access private members

        Library.showStats( lib); // passing an object to a method so that it can access private members inside it

        lib.showBooks(); //16
    }
}
