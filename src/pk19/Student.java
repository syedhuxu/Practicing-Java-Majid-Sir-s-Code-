package pk19;

public class Student {
    private String name;
    private int rollNo;

    Student(String nm , int rl){
        this.name = nm;
        this.rollNo = rl;
    }

    public void display(){
        System.out.println(name+ " " +  rollNo);
    }
}
