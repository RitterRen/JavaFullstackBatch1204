package Question3;

public class MyHashMap<K, V> {
    LinkedList<K, V>[] buckets;
    public MyHashMap() {
        buckets = new LinkedList[32];
    }
    public void put(K key, V value) {
        if (this.contains(key)) {
            Entry<K, V> entry = this.getEntry(key);
            entry.value = value;

            return;
        }

        int i = this.getBucketIndex(key);

        if (buckets[i] == null) {
            buckets[i] = new LinkedList<>();
        }

        LinkedList<K, V> list = buckets[i];
        list.add(new Entry<>(key, value));
    }

    public V get(K key) {
        if (!this.contains(key)) return null;

        LinkedList<K, V> list = buckets[this.getBucketIndex(key)];

        return list.get(key).value;
    }

    public Entry<K, V> getEntry(K key) {
        if (!this.contains(key)) return null;

        LinkedList<K, V> list = buckets[this.getBucketIndex(key)];

        return list.get(key);
    }
    public boolean contains(K key) {
        int i = this.getBucketIndex(key);
        if (buckets[i] == null) return false;

        LinkedList<K, V> entryList = buckets[i];

        return entryList.get(key) != null;
    }
    private int getBucketIndex(K key) {
        return key.hashCode() & (buckets.length - 1);
    }
}
