package pk3;
import java.util.Arrays;

public class Snippet2 {

    public static void main(String[] args) {

        int[] marks = {12, 15, 18, 21, 24};

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] % 3 == 0) {
                marks[i] = marks[i] / 3;
            }
            else {
                marks[i] = marks[i] + 2;
            }
        }

        int total = 0;

        for (int mark : marks) {

            if (mark % 2 == 0) {
                total += mark;
            }
        }

        System.out.println(Arrays.toString(marks));
        System.out.println(total);

        int index = 0;

        while (index < marks.length) {

            marks[index] += index;

            index++;
        }

        System.out.println(Arrays.toString(marks));
    }
}