package pk20;

public class Dog1 implements Animal1{
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping... Zzz");
    }
}
