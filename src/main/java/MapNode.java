public class MapNode<K, V> implements ParentNode<K> {
    K key;
    V value;
    MapNode<K, V> nextNode;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
        nextNode = null;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public ParentNode getNextNode() {
        return null;
    }

    public void setNextNode(ParentNode nextNode) {
        this.nextNode = (MapNode<K, V>) nextNode;
    }

    public String toString() {
        StringBuilder hashNodeString = new StringBuilder();
        hashNodeString.append("MyHashTableNode {" + "K = ").append(key)
                .append("V = ").append(value).append("}");
        if (nextNode != null)
            hashNodeString.append(" -> ").append(nextNode);
        return hashNodeString.toString();

    }

}

