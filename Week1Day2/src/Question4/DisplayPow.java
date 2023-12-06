package Question4;

public class DisplayPow {
    public static void countAndDisplayPow() {
        final int num = 5;

        System.out.println("a    b   pow(a, b)");
        for (int a = 0; a <= num; a++) {
            int b = a + 1;
            int res = (int) Math.pow(a, b);

            System.out.println(a + "    " + b + "     " + res);
        }
    }

    public static void main(String[] args) {
        countAndDisplayPow();
    }
}
