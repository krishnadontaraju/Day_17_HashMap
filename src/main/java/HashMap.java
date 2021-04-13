public class HashMap<K, V> {
    CustomLinkedList<K> customHashMap;

    HashMap() {
        this.customHashMap = new CustomLinkedList();
    }

    public V get(K key) {
        MapNode<K, V> newMapNode = (MapNode<K, V>) this.customHashMap.searchNode(key);
        return (newMapNode == null) ? null : newMapNode.getValue();
    }

    public void add(K key, V value) {
        MapNode<K, V> newMapNode = (MapNode<K, V>) this.customHashMap.searchNode(key);
        if (newMapNode == null) {
            newMapNode = new MapNode<>(key, value);
            this.customHashMap.append(newMapNode);
        } else
            newMapNode.setValue(value);

    }
}
