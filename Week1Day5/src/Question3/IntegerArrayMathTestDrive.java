package Question3;

public class IntegerArrayMathTestDrive {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int[] denom = {0, 3, 5, 2, 5};
        IntegerArrayMath arrMath = new IntegerArrayMath(numbers, denom);

        arrMath.divideValue();
    }
}
