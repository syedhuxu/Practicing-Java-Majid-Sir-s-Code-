package pk3;
class Student {

    String name;
    int age;
    double marks;

    Student() {
        this("Unknown", 0, 0.0);
        System.out.println("Default constructor");
    }

    Student(String name, int age) {
        this(name, age, 0.0);
        System.out.println("Two-argument constructor");
    }

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        System.out.println("Three-argument constructor");
    }

    void display() {
        System.out.println(name + " " + age + " " + marks);
    }

    void display(String message) {
        System.out.println(message);
        System.out.println(name + " " + age + " " + marks);
    }

    void updateMarks(double marks) {
        this.marks = marks;
    }

    void updateMarks(double marks, int extra) {
        this.marks = marks + extra;
    }
}