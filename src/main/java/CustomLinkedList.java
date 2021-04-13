/**
 * The class Custom Linked List uses generic Nodes Class and
 * adds functionalities that make these behave like a Linked List
 */
public class CustomLinkedList<K> {
    public ParentNode tail;
    public ParentNode head;

    CustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * The add method takes a Node and adds it to the list at Front
     *
     * @param parameterNode
     */
    public void add(ParentNode<K> parameterNode) {
        if (this.tail == null)
            this.tail = parameterNode;
        if (this.head == null)
            this.head = parameterNode;
        else {
            ParentNode<K> temporaryNode = this.head;
            this.head = parameterNode;
            this.head.setNextNode(temporaryNode);
        }
    }

    /**
     * The append method adds the latest element to the last of the list
     *
     * @param parameterNode
     */
    public void append(ParentNode parameterNode) {
        if (this.tail == null)
            this.tail = parameterNode;
        if (this.head == null)
            this.head = parameterNode;
        else {
            this.tail.setNextNode(parameterNode);
            this.tail = parameterNode;
        }
    }

    /**
     * The insert method allows to place the new node in Between initial node and after node
     *
     * @param initialNode
     * @param currentNode
     */
    public void insertNodeBetween(ParentNode initialNode, ParentNode currentNode) {
        ParentNode temporaryNode = initialNode.getNextNode();
        initialNode.setNextNode(currentNode);
        currentNode.setNextNode(temporaryNode);
    }

    /**
     * The pop method removes the first element from the list
     *
     * @return
     */
    public void pop() {

        ParentNode temporaryNode = this.head;
        this.head = head.getNextNode();

    }

    /**
     * the popLast method deletes the last node of the list
     */
    public void popLast() {
        ParentNode temporaryNode = head;
        while (!temporaryNode.getNextNode().equals(tail)) {
            temporaryNode = temporaryNode.getNextNode();
        }
        this.tail = temporaryNode;

    }


    public void printAllNodes() {
        StringBuffer currentNodes = new StringBuffer("All Nodes are : ");
        ParentNode temporaryNode = head;
        while (temporaryNode.getNextNode() != null) {
            currentNodes.append(temporaryNode.getKey());
            if (!temporaryNode.equals(tail)) {
                currentNodes.append(" points to ");
            }
            temporaryNode = temporaryNode.getNextNode();
        }
        currentNodes.append(temporaryNode.getKey());
        System.out.println(currentNodes);
    }

    /**
     * @param key node
     * @return true/false
     */
    public ParentNode searchNode(K key) {
        ParentNode<K> iterableNode = head;

        while (iterableNode != null) {

            if (iterableNode.getKey().equals(key)) {
                System.out.println("YES, THE NODE YOU ARE LOOKING FOR HAS BEEN FOUND");
                return iterableNode;
            } else
                return null;
        }
        return null;
    }

    /**
     * The method takes two
     *
     * @param nodeToBeInsertedAfter, which is the value after the node should be placed
     * @param nodeToBeInserted,      which is the node to placed
     */
    public void insertNodeAfterBySearching(int nodeToBeInsertedAfter, ParentNode nodeToBeInserted) {
        ParentNode iterableNode = head;

        while (iterableNode.getNextNode() != null) {

            if (iterableNode.getKey().equals(nodeToBeInsertedAfter)) {
                System.out.println("YES, THE NODE YOU ARE LOOKING FOR HAS BEEN FOUND");
                ParentNode temporaryNode = iterableNode.getNextNode();
                iterableNode.setNextNode(nodeToBeInserted);
                nodeToBeInserted.setNextNode(temporaryNode);
            }
            iterableNode = iterableNode.getNextNode();
        }

    }

    /**
     * Consider a -> b -> c -> d and delete c
     * so, first c = temporaryNode
     * then b.setNext = d
     *
     * @param valueOfNodeToBeDeleted, which is the value of node the User wants to remove
     */
    public void deleteNodeBySearchingValue(int valueOfNodeToBeDeleted) {
        ParentNode iterableNode = head;

        while (iterableNode.getNextNode() != null) {

            if (iterableNode.getNextNode().getKey().equals(valueOfNodeToBeDeleted)) {
                System.out.println(iterableNode.getKey());
                ParentNode temporaryNode = iterableNode.getNextNode();
                iterableNode.setNextNode(iterableNode.getNextNode().getNextNode());
            }
            iterableNode = iterableNode.getNextNode();
        }

    }


}
