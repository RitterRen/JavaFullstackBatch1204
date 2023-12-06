package Question7;

public class PrintNumberWithWord {
    public static String printNumberInWordWithNestedIf(int number) {
        if (number == 1) {
            return "ONE";
        } else if (number == 2) {
            return "TWO";
        } else if (number == 3) {
            return "THREE";
        } else if (number == 4) {
            return "FOUR";
        } else if (number == 5) {
            return "FIVE";
        } else if (number == 6) {
            return "SIX";
        } else if (number == 7) {
            return "SEVEN";
        } else if (number == 8) {
            return "EIGHT";
        } else if (number == 9) {
            return "NINE";
        } else {
            return "OTHER";
        }
    }

    public static String printNumberInWordWithSwitch(int number) {
        return switch (number) {
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
    }

    public static void main(String[] args) {
        int[] testcase1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int num: testcase1) {
            System.out.println(printNumberInWordWithNestedIf(num));
            System.out.println(printNumberInWordWithSwitch(num));
        }
    }
}
