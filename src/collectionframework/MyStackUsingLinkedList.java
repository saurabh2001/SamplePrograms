package collectionframework;

public class MyStackUsingLinkedList {
    StackNode topNode;

    public void push(int val){
        StackNode newNode = new StackNode(val);
        if(topNode == null){
            topNode = newNode;
        }
        else{
            newNode.next = topNode;
            topNode = newNode;
        }
    }
    public int pop(){
        int poppedValue = Integer.MIN_VALUE;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            poppedValue = topNode.data;
            topNode = topNode.next;
        }
        return poppedValue;
    }

    public boolean isEmpty()
    {
        if (topNode == null) {
            return true;
        }
        else
            return false;
    }

    private class StackNode{
        int data;
        StackNode next;

        StackNode(int val){
            data = val;
        }
    }


    public static void main(String[] args) {
        MyStackUsingLinkedList stack = new MyStackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Pushed elements:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("Adding another element and then popping");
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
