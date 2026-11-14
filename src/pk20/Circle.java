package pk20;

public class Circle extends Shape{

    @Override
    void draw(){
        System.out.println("Drawing Crilce");
    }

    static void main(String[] args) {
        Shape c1 = new Circle();
        c1.draw();
        c1.message();
    }
}
