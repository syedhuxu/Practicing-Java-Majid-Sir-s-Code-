package pk8;

public class ReturningObjectsDemo {

    public static void main(String[] args) {

        Student s1 = StudentFactory.createStudent("Aman", 80);

        Student s2 = StudentFactory.addBonus(s1);

        Student s3 = StudentFactory.createCopy(s1);

        s1.display();
        s2.display();
        s3.display();

      System.out.println(s1 == s2); // true
       System.out.println(s1 == s3); // false because createCopy()creates a new student and returns it.
    }
}