package pk6;

public class Snippet4 {
    public static void main(String[] args) {

        Score s = new Score();

       s.change(4);
        s.showPoints();

        s.change(2.8);
        s.showPoints();

       s.identify('A');
       s.identify(65);
        s.identify(65.0);
        s.identify('A' + 1); // yha pe basically type casting ho rhi hai char int mai convert ho rha hai  toh output 66 aye ga.

       System.out.println("Final points: " + s.points);
    }
}
