package pk3;
class Employee {

    static int companyEmployees = 0;

    String name;
    int salary = 20000;

    static {
        companyEmployees = 100;
        System.out.println("Static block executed");
    }

    {
        salary += 5000;
        System.out.println("Instance block executed");
    }

    Employee() {
        companyEmployees++;
        System.out.println("Default constructor");
    }

    Employee(String name) {
        this();
        this.name = name;
        salary += 1000;
        System.out.println("Parameterized constructor");
    }

    void show() {
        System.out.println(name + " " + salary + " " + companyEmployees);
    }

    void show(String message) {
        System.out.println(message);
        System.out.println(name + " " + salary + " " + companyEmployees);
    }
}