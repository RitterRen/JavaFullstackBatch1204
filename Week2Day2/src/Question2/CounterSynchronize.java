package Question2;

import Question1.Counter;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class CounterSynchronize {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Random random = new Random();
        ReentrantLock reLock = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(random.nextInt(10));
                reLock.lock();
                counter.increment();
                reLock.unlock();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(random.nextInt(10));
                reLock.lock();
                counter.decrement();
                reLock.unlock();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Result for question2: " + counter.value());
    }
}
