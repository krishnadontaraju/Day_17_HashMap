public class OrderedLinkedList {
    private SortableNode head; // ref to first link on list

    public OrderedLinkedList() {
        head = null;
    }

    /**
     * Insert Node in Sorted LinkedList (in between of other Nodes).
     */
    public void insertNodeInSortedLinkedList(int data) {

        SortableNode newSortableNode = new SortableNode(data);

        //Case1: when there is no element in LinkedList
        if (head == null) { //means LinkedList is empty, make first point to new Node.
            head = newSortableNode;  //first ---> newNode
            return;
        }

        //Case2: when newNode should be placed at first.
        if (head.value.compareTo(newSortableNode.value) > 0) {
            newSortableNode.nextNode = head;
            head = newSortableNode; //first ---> newNode
            return;
        }

        //Case3: when newNode should be at some position other than first.
        SortableNode currentNode = head;
        SortableNode previousNode = null;

        while (currentNode != null) {
            if (currentNode.value.compareTo(newSortableNode.value) < 0) {
                if (currentNode.nextNode == null) { //means currentNode is last node, insert new node after currentNode.
                    currentNode.nextNode = newSortableNode;
                    return;
                }
                previousNode = currentNode;
                currentNode = currentNode.nextNode; //move to next node.
            } else {
                newSortableNode.nextNode = previousNode.nextNode; //make new node's next point to previousNode node's next
                previousNode.nextNode = newSortableNode;  //make previousNode nodes' next point to new node.
                return;
            }
        }
    }

    /**
     * Display Ordered LinkedList
     */
    public void displayOrderedLinkedList() {
        SortableNode temporaryDisplay = head; // start at the beginning of linkedList
        while (temporaryDisplay != null) { // Executes until we don't find end of list.
            temporaryDisplay.displayNode();
            temporaryDisplay = temporaryDisplay.nextNode; // move to next Node
        }
        System.out.println();

    }

}

