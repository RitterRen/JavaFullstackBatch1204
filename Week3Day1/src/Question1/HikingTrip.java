package Question1;

import java.util.Arrays;
import java.util.Stack;

public class HikingTrip {
    public static int[] hillClimbing(int[] heights) {
        // Monotonic small stack
        Stack<Integer> smallStack = new Stack<>();
        int[] res = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {
            while(!smallStack.isEmpty() && heights[smallStack.peek()] < heights[i]) {
                smallStack.pop();
            }

            if (!smallStack.isEmpty()) res[i] = smallStack.peek() - i;

            smallStack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] testcase1 = {78, 90, 65, 51, 87, 99, 100, 31, 150};
        System.out.println(Arrays.toString(hillClimbing(testcase1)));
    }
}
