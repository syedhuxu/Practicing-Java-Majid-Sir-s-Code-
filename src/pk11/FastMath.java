package pk11;


interface FastMath {
    default int compute(int n) {
        return n * 2;
    }
}