class Implementer implements Left, Right {
    public void print() {
        Left.super.print();
        Right.super.print();
        System.out.print(Left.VAL + Right.VAL);
    }
}