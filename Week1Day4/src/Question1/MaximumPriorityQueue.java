package Question1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumPriorityQueue {

    public PriorityQueue<Integer> createMaximumPriorityQueue() {
        return new PriorityQueue<>((o1, o2) -> o2 - o1);
    }

    public static void main(String[] args) {
        MaximumPriorityQueue queue = new MaximumPriorityQueue();
        PriorityQueue<Integer> maxHeap = queue.createMaximumPriorityQueue();

        int[] nums = {4, 6, 9, 1, -2, 10, 89, 100};
        for (Integer num: nums) {
            maxHeap.add(num);
        }

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
