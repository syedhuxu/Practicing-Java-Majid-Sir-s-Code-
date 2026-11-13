package pk19;

public class Number {
    int value;

    Number(int val){
        this.value = val;
    }

    Number add(Number n){
        return new Number(this.value + n.value);
    }

    static void main(String[] args) {
         Number n1 = new Number(10);
         Number n2 = new Number(30);
         Number result = n1.add(n2);
        System.out.println(result.value);
    }
}
