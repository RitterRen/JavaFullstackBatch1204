package Question8;

import java.util.Objects;

public class CustomInteger {
    final int num;

    CustomInteger(int number) {
        this.num = number;
    }

    public int getValue() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof Integer) {
            int numberO = (int) o;
            return num == numberO;
        };

        return false;
    }

    @Override
    public int hashCode() {
        return num;
    }

    // Test
    public static void main(String[] args) {
        CustomInteger customInteger = new CustomInteger(10);
        int value1 = 10;
        String value2 = "11111";

        System.out.println(customInteger.equals(10));
        System.out.println(customInteger.equals(value2));
    }
}
