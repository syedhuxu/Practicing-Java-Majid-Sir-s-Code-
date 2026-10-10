package pk5;

import java.util.Arrays;

public class Snippet1 {
    public static void main(String[] args) {

        int[] nums = {3, 6, 9, 12, 15};
        int score = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 3 == 0 && i % 2 == 0) {
                nums[i] -= i;
            } else {
                nums[i] += 2;
            }

            if (nums[i] % 2 == 0) {
                score += nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("Score: " + score);

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result += nums[i] * (i + 1);
        }

        System.out.println("Result: " + result);
    }
}