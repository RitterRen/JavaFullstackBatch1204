package Question1;

import java.util.LinkedList;
import java.util.List;

public class CalculatorTestDrive {

    public static void main(String[] args) {
        List<Integer> input1 = new LinkedList<>();
        input1.add(5);
        input1.add(6);
        input1.add(14);
        input1.add(7);
        List<String> input2 = new LinkedList<>();
        input2.add("Add");
        input2.add("Sub");
        input2.add("Div");
        Calculator calculator = new Calculator();

        System.out.println(calculator.calculate(input1, input2));
    }
}