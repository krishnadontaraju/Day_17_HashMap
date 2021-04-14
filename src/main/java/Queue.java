public class Queue<K> {
    CustomLinkedList customQueue = new CustomLinkedList();

    public void enqueue(ParentNode parameterNode) {
        customQueue.append(parameterNode);
    }

    public void dequeue() {
        customQueue.popLast();
    }

    public ParentNode showLatestNodeOfQueue() {
        return customQueue.head;
    }

    public ParentNode showFirstNodeOfQueue() {
        return customQueue.tail;
    }
}
