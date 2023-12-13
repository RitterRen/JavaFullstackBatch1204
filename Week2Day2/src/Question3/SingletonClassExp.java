package Question3;

public class SingletonClassExp {
    private static SingletonClassExp singletonExp;

    public static SingletonClassExp getInstance() {
        // Lazy initiate
        if (singletonExp == null) {
            synchronized (SingletonClassExp.class) {
                if (singletonExp == null) {
                    singletonExp = new SingletonClassExp();
                }
            }
        }

        return singletonExp;
    }
}
