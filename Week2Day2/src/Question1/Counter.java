package Question1;

public class Counter {
    private int c;

    public Counter() {
        this.c = 0;
    }

    public void increment() {
        this.c++;
    }
    public void decrement() {
        this.c--;
    }
    public int value() {
        return c;
    }
}
