package pk20;

class Cat1 implements Animal1 {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is taking a nap... Purr");
    }

    static void main(String[] args) {
        Animal1 myDog = new Dog1();
        Animal1 myCat = new Cat1();

        // Call the methods
        myDog.makeSound();
        myDog.sleep();

        System.out.println("---");

        myCat.makeSound();
        myCat.sleep();
    }
}
