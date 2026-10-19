package pk14;

public class One {
    static void main(String[] args) {

        int x  = 10;
        int y = 3;

        try {
            double z =(double) x/y;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println(e);

        }finally {
            System.out.println("Mai to fir b chalu ga koye chale ya na chale");
        }


    }
}
