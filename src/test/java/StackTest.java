import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void whenPushedAnElement_ShouldBeAtTheFront() {
        NodeClass<Integer> firstNode = new NodeClass<>(70);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(56);

        Stack customStack = new Stack();

        customStack.push(firstNode);
        customStack.push(secondNode);
        customStack.push(thirdNode);

        ParentNode testNode = customStack.peek();

        Assertions.assertEquals(thirdNode, testNode);
    }

    @Test
    public void whenPoppedAnElement_TailShouldBeMovedBack() {
        NodeClass<Integer> firstNode = new NodeClass<>(70);
        NodeClass<Integer> secondNode = new NodeClass<>(30);
        NodeClass<Integer> thirdNode = new NodeClass<>(56);

        Stack customStack = new Stack();

        customStack.push(firstNode);
        customStack.push(secondNode);
        customStack.push(thirdNode);

        customStack.pop();

        ParentNode testNode = customStack.peek();

        Assertions.assertEquals(testNode, secondNode);
    }
}
