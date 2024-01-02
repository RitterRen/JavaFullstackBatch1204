package Question3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    int size;

    int capacity;

    LinkedList<Integer> orderList;

    Map<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.orderList = new LinkedList<>();
        this.map = new HashMap<>();
    }

    public void put(int key, int value) {
        if (size >= capacity) {
            int oldKey = orderList.removeFirst();
            map.remove(oldKey);
            size--;
        }

        orderList.add(key);
        map.put(key, value);
        size++;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        orderList.remove(Integer.valueOf(key));
        orderList.add(key);

        return map.get(key);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        lruCache.put(4, 4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));
    }
}
