package Question3;

public class SingletonTestDrive {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            SingletonClassExp singleton = SingletonClassExp.getInstance();
            System.out.println(singleton.hashCode());
            System.out.println(singleton);
        });
        Thread t2 = new Thread(() -> {
            SingletonClassExp singleton = SingletonClassExp.getInstance();
            System.out.println(singleton.hashCode());
            System.out.println(singleton);
        });
        Thread t3 = new Thread(() -> {
            SingletonClassExp singleton = SingletonClassExp.getInstance();
            System.out.println(singleton.hashCode());
            System.out.println(singleton);
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
