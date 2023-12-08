package Question3;

public class LinkedList<K, V> {
    ListNode<K, V> head;
    public LinkedList() {
        head = new ListNode<K, V>();
    }
    public void add(Entry<K, V> entry) {
        ListNode<K, V> node = new ListNode<>(entry);
        ListNode<K, V> nextNode = head.next;

        head.next = node;
        node.next = nextNode;
    }
    public Entry<K, V> get(K key) {
        ListNode<K, V> p = head;

        while (p.next != null) {
            p = p.next;

            if (p.val.key == key) {
                return p.val;
            }
        }

        return null;
    }
}
