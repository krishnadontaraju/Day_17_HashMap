public class Stack {
    private CustomLinkedList customStack = new CustomLinkedList();

    public void push(ParentNode value){
        customStack.add(value);
    }
    public ParentNode peek(){
        return customStack.head;
    }
    public void pop(){
        customStack.pop();
    }
}
