package Question6;

public class FindSingleNumber {

    public int findSingleNumber(int[] arr) {
        int result = 0;

        for (int num: arr) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] testcase1 = {2, 2, 1};
        int[] testcase2 = {4, 1, 2, 1, 2};
        FindSingleNumber solution = new FindSingleNumber();

        System.out.println(solution.findSingleNumber(testcase1));
        System.out.println(solution.findSingleNumber(testcase2));
    }
}
