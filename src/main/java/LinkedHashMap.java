import java.util.ArrayList;

public class LinkedHashMap<K, V> {
    private final int buckets;
    ArrayList<CustomLinkedList<K>> bucketArray;

    public LinkedHashMap() {
        this.buckets = 10;
        this.bucketArray = new ArrayList<>(buckets);

        for (int i = 0; i < buckets; i++)
            this.bucketArray.add(null);

    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % buckets;
        return index;
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        CustomLinkedList<K> newLinkedList = this.bucketArray.get(index);
        if (newLinkedList == null)
            return null;
        MapNode<K, V> newMapNode = (MapNode<K, V>) newLinkedList.searchNode(key);
        return (newMapNode == null) ? null : newMapNode.getValue();
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        CustomLinkedList<K> newLinkedList = this.bucketArray.get(index);
        if (newLinkedList == null) {
            newLinkedList = new CustomLinkedList<>();
            this.bucketArray.set(index, newLinkedList);
        }

        MapNode<K, V> newMapNode = (MapNode<K, V>) newLinkedList.searchNode(key);
        if (newMapNode == null) {
            newMapNode = new MapNode<>(key, value);
            newLinkedList.append(newMapNode);
        } else
            newMapNode.setValue(value);
    }


}
