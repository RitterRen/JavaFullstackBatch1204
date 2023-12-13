package Question3;

public class SumOfTwoLinkedList {
    public static int sumOfLinkedList(ListNode l1, ListNode l2) {
        ListNode reverseL1 = reverseLinkedList(l1);
        ListNode reverseL2 = reverseLinkedList(l2);

        return convertLinkedListToInt(reverseL1) + convertLinkedListToInt(reverseL2);
    }

    private static int convertLinkedListToInt(ListNode root) {
        int total = 0;
        int pow = 0;
        ListNode p = root;

        while (p != null) {
            total += (int) (p.val * Math.pow(10, pow++));
            p = p.next;
        }

        return total;
    }

    private static ListNode reverseLinkedList(ListNode root) {
        ListNode prev = null;
        ListNode curr = root;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {
        int[] l1 = {5, 2, 3};
        int[] l2 = {1, 9};
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(9);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);

        System.out.println(sumOfLinkedList(n1, n2));
    }
}
