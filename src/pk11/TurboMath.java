package pk11;

interface TurboMath extends FastMath {
    default int compute(int n) {
        return n * 3;
    }
}