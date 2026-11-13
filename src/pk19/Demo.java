package pk19;

public class Demo {
    static {
        System.out.println("I'm Static Block");
    }
    Demo(){
        System.out.println("I'm Constructor");
    }

    static void main(String[] args) {
        System.out.println("I'm Main Method");
        Demo d = new Demo();

    }

}
