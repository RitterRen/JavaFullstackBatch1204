package Question1;

import java.util.List;

public class Calculator {

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    private int sub(int num1, int num2) {
        return num1 - num2;
    }

    private int sub(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }

    private int mul(int num1, int num2) {
        long res = (long)num1 * num2;

        if (res > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int)res;
    }

    private int mul(int num1, int num2, int num3) {
        long res = (long)num1 * num2 * num3;

        if (res > Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return (int)res;
    }

    private int div(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }

        return num1 / num2;
    }

    private int div(int num1, int num2, int num3) {
        if (num2 == 0 || num3 == 0) {
            return 0;
        }

        return num1 / num2 / num3;
    }

    public int calculateHelper(int num1, int num2, String operator) {
        return switch (operator) {
            case "Add" -> this.add(num1, num2);
            case "Sub" -> this.sub(num1, num2);
            case "Mul" -> this.mul(num1, num2);
            case "Div" -> this.div(num1, num2);
            default -> 0;
        };
    }

    public int calculate(List<Integer> arr, List<String> operators) {
        // First calculate Mul and Div
        for (int i = 0; i < operators.size(); i++) {
            String operator = operators.get(i);
            if (operator.equals("Mul") || operator.equals("Div")) {
                int num = calculateHelper(arr.get(i), arr.get(i + 1), operator);
                arr.set(i, num);
                arr.remove(i + 1);
                operators.remove(i--);
            }
        }

        // Calculate Add and Sub
        int result = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            result = calculateHelper(result, arr.get(i), operators.get(i - 1));
        }

        return result;
    }
}
