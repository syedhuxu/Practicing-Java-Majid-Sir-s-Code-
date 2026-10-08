package pk2;

public class Snippet3 {

    public static void main(String[] args) {

        Parent p = new Child();

        Child c = new Child();

        System.out.println(p.value); //10
        System.out.println(c.value); //20

        System.out.println(Parent.name); //Parent
        System.out.println(Child.name); //Child

        p.show(); // calls the same function
        c.show(); // calls the same function

        p.kind();  //calls kind() of parent
        c.kind(); //calls kind() of child

        p.fixed();
    }
}