package Question2;

public class NonIntResultException extends Exception{
    public NonIntResultException(int a, int b) {
        super(a + " divided by " + b + " is not an integer");
    }
}
