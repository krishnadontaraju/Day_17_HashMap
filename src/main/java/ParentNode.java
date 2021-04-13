/**
 * Created an interface that will hold the get and set methods
 * for future nodes that can implement this Interface with their own
 * Modifications
 *
 * @param <K>
 */
public interface ParentNode<K> {
    K getKey();

    void setKey(K key);

    ParentNode<K> getNextNode();

    void setNextNode(ParentNode<K> nextNode);

}
