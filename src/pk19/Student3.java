package pk19;

public class Student3 {

    String name;
    int salary;


    Student3(){
        this("huxu");
    }
    Student3(String n){
        this(n,1000);
    }
    Student3(String n, int s){
        this.name =n;
        this.salary = s;
        }

    static void main(String[] args) {
        Student3 s = new Student3();
        System.out.println(s.name);
        System.out.println(s.salary);
    }
}
