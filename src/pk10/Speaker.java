package pk10;

interface Speaker {
    public  default void speak() {
        System.out.print("Speaker ");
    }

    // interfaces can have default methods , here default means actual default , not the access modifier wala default.
}
