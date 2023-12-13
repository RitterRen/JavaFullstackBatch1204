package Question1;

import java.util.Random;

public class CounterMultipleThreadTestDrive {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Random random = new Random();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 300; i++) {
                counter.increment();
                try {
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 300; i++) {
                counter.decrement();
                try {
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final result is ：" + counter.value());
    }
}
