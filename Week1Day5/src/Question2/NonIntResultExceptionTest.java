package Question2;

public class NonIntResultExceptionTest {
    public void checkDivision(int a, int b) throws NonIntResultException {
        if (a % b != 0) {
            throw new NonIntResultException(a, b);
        }
    }

    public static void main(String[] args) {
        NonIntResultExceptionTest testObj = new NonIntResultExceptionTest();

        try{
            testObj.checkDivision(7, 2);
            testObj.checkDivision(8, 2);
        }catch (NonIntResultException e) {
            System.out.println(e.getMessage());
        }
    }
}
