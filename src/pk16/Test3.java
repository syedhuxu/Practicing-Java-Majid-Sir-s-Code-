package pk16;

public class Test3 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][];
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = matrix[0];

        matrix[1][1] = 99;

        for (int val : matrix[0]) {
            System.out.print(val + " ");
        }
    }
}
