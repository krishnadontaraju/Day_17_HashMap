class SortableNode<K extends Comparable<K>> {
    public K value;
    public SortableNode nextNode;

    /**
     * Constructor
     */
    public SortableNode(K value) {
        this.value = value;
    }

    /**
     * Display Node's data
     */
    public void displayNode() {
        System.out.print(value + " ");
    }
}
