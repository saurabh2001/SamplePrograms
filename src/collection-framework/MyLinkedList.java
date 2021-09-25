package collection-framework;

public class MyLinkedList {
    int size;
    Node head;

    public MyLinkedList(){
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

    public void addToStart(String item){
        Node newNode = new Node(item);

        if(head == null){
            head = newNode;
            return;
        }
        // attach new node before the head
        newNode.next = head;
        head = newNode;
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

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addToEnd("A");
        list.addToEnd("D");
        list.addToEnd("B");
        list.print();

        MyLinkedList list1 = new MyLinkedList();
        list1.addToStart("A");
        list1.addToStart("D");
        list1.addToStart("B");
        list1.print();

    }
}
