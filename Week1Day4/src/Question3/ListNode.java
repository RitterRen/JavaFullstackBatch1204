package Question3;

public class ListNode<K, V> {
    Entry<K, V> val;
    ListNode<K, V> next;
    public ListNode(){}
    public ListNode(Entry<K, V> entry){this.val = entry;}
}
