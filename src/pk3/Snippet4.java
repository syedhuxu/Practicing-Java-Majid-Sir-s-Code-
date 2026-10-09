package pk3;

public class Snippet4 {

    public static void main(String[] args) {

        System.out.println(Employee.companyEmployees);

       Employee e1 = new Employee("A");

     Employee e2 = new Employee("B");

       e1.salary += 2000;

      e1.show();
       e2.show("Employee 2:");

        System.out.println(Employee.companyEmployees);
    }
}