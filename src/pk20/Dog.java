package pk20;

public class Dog extends  Animal{

    Dog(){
        super(20,10);
        System.out.println("Dog's Constructor");
    }
    int x = 200;
    @Override
    void sound(){
        System.out.println("Bark");
        System.out.println(x);
        System.out.println(super.x);
        super.sound();
    }

    static void main(String[] args) {
        Animal a= new Dog();
        a.sound();
    }
}
