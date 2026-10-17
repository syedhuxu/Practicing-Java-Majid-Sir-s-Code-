package pk13;

interface Worker {
    default void process() {
        log();
        System.out.print("Work ");
    }

    private void log() {
        System.out.print("BaseLog ");
    }
}