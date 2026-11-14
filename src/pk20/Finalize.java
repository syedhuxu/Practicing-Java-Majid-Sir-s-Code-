package pk20;

public class Finalize {
    @Override
    protected  void finalize()throws  Throwable{
        System.out.println("Cleanup");
    }

    static void main(String[] args) {
    }
}
