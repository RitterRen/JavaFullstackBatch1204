package Question4;

public class Driver {
    public static void main(String[] args){
        Object key1 = new Object();
        Object key2 = new Object();
        Thread t8 = new Thread( () -> {
            synchronized (key1) {
                System.out.println("t8 has key 1.");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (key2) {
                    System.out.println("t8 has key 2");
                }
            }
        });
        Thread t9 = new Thread( () -> {
            synchronized (key1) {
                System.out.println("t9 has key 2.");
                synchronized (key2) {
                    System.out.println("t9 has key 1");
                }
            }
        });
        t8.start();
        t9.start();
    }
}
