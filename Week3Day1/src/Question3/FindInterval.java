package Question3;

import java.util.Arrays;
import java.util.HashMap;

public class FindInterval {
    public static int[] findInterval(int[][] intervals) {
        int[] timeFreq = new int[106];

        for (int[] interval: intervals) {
            for (int i = interval[0]; i < interval[1]; i++) {
                timeFreq[i]++;
            }
        }

        int maxFreq = 0;
        for (int freq: timeFreq) {
            maxFreq = Math.max(freq, maxFreq);
        }

        int[] res = new int[2];
        int left = 0;
        int right = 0;

        while(right < timeFreq.length) {
            while(right < timeFreq.length && timeFreq[left] == maxFreq && timeFreq[right] == maxFreq) {
                right++;
            }

            if (timeFreq[left] == maxFreq && right - left > res[1] - res[0]) {
                res[0] = left;
                res[1] = right;
            }

            left = ++right;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] testcase1 = {{1, 4}, {2, 9}, {3, 5}, {8, 10}};
        int[][] testcase2 = {{2, 3}, {5, 9}, {1, 2}, {10, 14}};

        System.out.println(Arrays.toString(findInterval(testcase1)));
        System.out.println(Arrays.toString(findInterval(testcase2)));
    }
}
