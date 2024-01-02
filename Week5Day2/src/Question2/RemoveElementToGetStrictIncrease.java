package Question2;

public class RemoveElementToGetStrictIncrease {
    public int removeIndex(int[] arr){
        int res = -1;
        int times = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                res = i;
                times++;
            }
            if (times > 1) return -1;
        }

        return res;
    }

    public static void main(String[] args) {
        RemoveElementToGetStrictIncrease solution = new RemoveElementToGetStrictIncrease();
        int[] test1 = {1,999,998,997};
        int[] test2 = {2,3,6,4,5,9};
        int[] test3 = {2,2,2};
        int[] test4 = {2,2};

        System.out.println(solution.removeIndex(test1));
        System.out.println(solution.removeIndex(test2));
        System.out.println(solution.removeIndex(test3));
        System.out.println(solution.removeIndex(test4));
    }
}
