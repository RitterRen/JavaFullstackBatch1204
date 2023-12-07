package Question2;

import java.util.Random;

public class Generator {
    Random random;
    public Generator() {
        random = new Random();
    }
    public int getRandomInMax(int max) {
        return random.nextInt(max + 1);
    }
}
