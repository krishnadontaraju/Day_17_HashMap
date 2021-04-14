import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test

    public void whenEnqueued_shouldBeAtLast() {
        NodeClass<Integer> firstNode = new NodeClass<>(70);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(56);

        Queue customQueue = new Queue();

        customQueue.enqueue(firstNode);
        customQueue.enqueue(secondNode);
        customQueue.enqueue(thirdNode);

        Assertions.assertEquals(customQueue.showLatestNodeOfQueue(), firstNode);
    }

    @Test

    public void whenDequeued_TailShouldBeMovedBackOneNode() {
        NodeClass<Integer> firstNode = new NodeClass<>(70);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(56);

        Queue customQueue = new Queue();

        customQueue.enqueue(firstNode);
        customQueue.enqueue(secondNode);
        customQueue.enqueue(thirdNode);

        customQueue.dequeue();

        Assertions.assertEquals(customQueue.showFirstNodeOfQueue(), secondNode);
    }
}
