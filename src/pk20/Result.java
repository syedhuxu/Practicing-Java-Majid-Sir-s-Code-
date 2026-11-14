package pk20;

public class Result {
    static void checkMarks(int m) throws InvalidMarksException{
        if(m<0|| m>100){
          throw new  InvalidMarksException("Marks must be between 1 to 100");
        }else {
            System.out.println("Valid marks recorded: " + m);        }
    }

   public static void main(String[] args) {
       try {
           Result.checkMarks(55);  // Succeeds
           Result.checkMarks(120); // Triggers InvalidMarksException!
       } catch (InvalidMarksException e) {
           System.out.println("Exception caught: " + e.getMessage());
       }
    }
}
