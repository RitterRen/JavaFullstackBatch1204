package Question5;

public class OccurrenceOfMaxNumbers {

    private int getLargestNumberInArray(int[] arr) {
        int res = Integer.MIN_VALUE;

        for (int num: arr) {
            if (res < num) res = num;
        }

        return res;
    }

    private int countAppearTimes(int[] arr, int num) {
        int count = 0;

        for (int number: arr) {
            if (number == num) count++;
        }

        return count;
    }

    public void printOccurrenceOfMaxNumbers(int[] arr) {
        int largestNumber = this.getLargestNumberInArray(arr);
        int times = this.countAppearTimes(arr, largestNumber);

        System.out.println("The largest number is " + largestNumber);
        System.out.println("The occurrence count of the largest number is " + times);
    }

    public static void main(String[] args) {
        int[] testcase1 = {3, 5, 2, 5, 5, 5, 0};
        OccurrenceOfMaxNumbers solution = new OccurrenceOfMaxNumbers();

        solution.printOccurrenceOfMaxNumbers(testcase1);
    }
}
