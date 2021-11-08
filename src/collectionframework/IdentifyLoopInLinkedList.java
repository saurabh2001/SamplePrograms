package collectionframework;

import java.util.HashSet;

public class IdentifyLoopInLinkedList {
    int size;
    Node head;

    public IdentifyLoopInLinkedList(){
        this.size = 0;
    }

    public void addToEnd(String item){
        Node newNode = new Node(item);

        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        //traverse till last node
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        //attach newly created node to end
        lastNode.next = newNode;
    }

    public void print(){
        Node n = head;
        while(n != null){
            System.out.println(n.item + " ");
            n = n.next;
        }
    }

    private class Node{
        String item;
        Node next;

        Node(String item){
            this.item = item;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item='" + item + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    static boolean detectLoop(IdentifyLoopInLinkedList list)
    {
        Node head = list.head;
        HashSet<Node> s = new HashSet<Node>();
        while(head != null) {
            if(s.contains(head)) return true;

            s.add(head);
            head = head.next;
        }

        return false;
    }

    public static void main(String[] args) {

        IdentifyLoopInLinkedList list = new IdentifyLoopInLinkedList();
        list.addToEnd("A");
        list.addToEnd("B");
        list.addToEnd("C");
        list.addToEnd("D");
        list.print();

        /*Create loop for testing */
        list.head.next.next.next.next = list.head;
        if(detectLoop(list))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}
