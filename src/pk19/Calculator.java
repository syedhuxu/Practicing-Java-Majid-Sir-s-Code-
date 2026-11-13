package pk19;

public class Calculator {
    int add(int a , int b){
        return  a+b;
    }

    double add(double a , int b){
        return  a+b;
    }

    int add(int a , int b,int c){
        return  a+b*c;
    }

    static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(29,90));
        System.out.println(c1.add(2.9,90));
        System.out.println(c1.add(29,90,4));

    }
}
