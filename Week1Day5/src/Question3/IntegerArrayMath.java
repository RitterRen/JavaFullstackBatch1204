package Question3;

import Question2.NonIntResultException;

public class IntegerArrayMath {
    int[] numbers;
    int[] denom;
    public IntegerArrayMath(int[] numbers, int[] denom) {
        this.numbers = numbers;
        this.denom = denom;
    }
    public void divideValue() {
        for (int i = 0; i < numbers.length; i++) {
            try{
                if (numbers[i] % denom[i] == 0) {
                    System.out.println("The result for the division is: " + numbers[i] / denom[i]);
                } else {
                    throw new NonIntResultException(numbers[i], denom[i]);
                }
            }catch (NonIntResultException | ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
