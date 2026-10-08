package pk1;
import java.util.Arrays;

public class One {

    public static void main(String[] args) {

        int a = 7;
        double b = 2.5;
        char c = 'A';

        int[] numbers = {2, 4, 6, 8, 10};

        int x = (int) (a + b * 2) - 3; // (7+2.5*2)-3 = 2.5*2 = 5+7 = 12-3 => x = 9;

        int bitValue = (numbers[0] & numbers[2]) | 3; // 3

        boolean result =
                a > 5 && b < 3 || numbers[1] == 4; // true & true || false => true

        System.out.println(x); // 9
        System.out.println(c + x); // 65 + 9 = 74
        System.out.println(bitValue); //3
        System.out.println(result); // true

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 4 == 0) {
                numbers[i] += x;
            }
            else if (numbers[i] > 5 && result) {
                numbers[i]--;
            }
            else {
                numbers[i]++;
            }
        }

        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }
        System.out.println(sum); //47

        System.out.println(Arrays.toString(numbers)); // [3,13,5,17,9]
        System.out.println(sum / 2 + sum % 2); //24
    }
}