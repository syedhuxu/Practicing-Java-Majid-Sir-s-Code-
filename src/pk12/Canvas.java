package pk12;

class Canvas implements Left, Right {
    @Override
    public void render() {
        Left.super.render();
        System.out.print("C ");
    }
}