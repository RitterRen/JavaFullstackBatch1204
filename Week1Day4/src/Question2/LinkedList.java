package Question2;

public class LinkedList {
    private ListNode head;

    public LinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return;

        head = new ListNode(arr[0]);
        ListNode p = head;

        for (int i = 1; i < arr.length; i++) {
            p.next = new ListNode(arr[i]);
            p = p.next;
        }
    }

    public LinkedList(ListNode head) {
        this.head = head;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode p = head;

        while (p != null) {
            sb.append(p.val);
            sb.append(" -> ");
            p = p.next;
        }

        return sb.toString();
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode dummyHead = new ListNode(0);
        ListNode p = dummyHead;

        while (p1 != null && p2 != null) {
            if (p1.val >= p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }

            p = p.next;
        }

        while (p1 != null) {
            p.next = p1;
            p1 = p1.next;
            p = p.next;
        }

        while (p2 != null) {
            p.next = p2;
            p2 = p2.next;
            p = p.next;
        }

        return dummyHead.next;
    }

    public static ListNode removeOdd(ListNode head) {
        // Double Pointer
        ListNode dummyHead = new ListNode(0);
        ListNode prev = dummyHead;
        ListNode curr = head;
        dummyHead.next = head;

        while (curr != null) {
            if (curr.val % 2 == 0) {
                curr = curr.next;
            } else {
                ListNode temp = curr.next;
                curr.next = null;
                prev.next = temp;
                curr = temp;
                prev = prev.next;
            }
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {1, 3, 5, 7, 9};
        LinkedList list1 = new LinkedList(arr1);
        LinkedList list2 = new LinkedList(arr2);
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        LinkedList list3 = new LinkedList(merge(list1.head, list2.head));
        System.out.println("Merged List: " + list3);

        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList list4 = new LinkedList(arr4);
        System.out.println("List 4: " + list4);
        LinkedList list5 = new LinkedList(removeOdd(list4.head));
        System.out.println("List 5: " + list5);
    }
}
