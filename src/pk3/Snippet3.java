package pk3;

public class Snippet3 {

    public static void main(String[] args) {

         Student s1 = new Student();

        Student s2 = new Student("Rahul", 20);

        Student s3 = new Student("Aman", 21, 87.5);

         s1.display();
         s2.display("Student 2:");
         s3.updateMarks(80);
       s3.display();

      s2.updateMarks(70, 5);
        s2.display();
    }
}