package pk17;

public class NoMan {
    public static void main(String[] args) {
        int mathScore = 100;
        int numberOfStudents = 0;

        // The compiler lets this pass. It trusts you.
        // But when you click RUN, it crashes with an ArithmeticException.
        int average = mathScore / numberOfStudents;
    }
}
