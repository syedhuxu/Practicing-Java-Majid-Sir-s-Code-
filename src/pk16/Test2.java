package pk16;
public class Test2 {

    public static void main(String[] args) {

        int i = 0, j = 10;
        boolean test = (i++ > 0) && (++j > 10); // && evaluates from left to right and  stops if one (left) condition gives false that means j is still 10;
        System.out.println(test + " i=" + i + " j=" + j);

        test = (++i > 0) || (++j > 10); // || also evaluates from left to right and stops if first (lett) gives true; which means j is still 10;
        System.out.println(test + " i=" + i + " j=" + j);
    }
}