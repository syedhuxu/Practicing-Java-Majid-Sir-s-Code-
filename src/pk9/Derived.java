package pk9;

class Derived implements Base {
    int ID = 200;

    @Override
    public void printId() {
        System.out.print(ID + " " + Base.ID + " ");
    }
}
