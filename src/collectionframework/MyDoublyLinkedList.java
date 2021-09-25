package collectionframework;

public class MyDoublyLinkedList {
    int size;
    Node head;

    public MyDoublyLinkedList(){
         this.size = 0;
    }

    public void addToEnd(String item){
        Node newNode = new Node(item);

        if(head == null){
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null)
        {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;

    }

    public void addToStart(String item){
        Node newNode = new Node(item);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;

        head = newNode;

    }

    public void print(){
        Node start = head;
        Node lastNode = null;
        System.out.println("Printing start to end");
        while(start != null){
            System.out.println(start.item + " ");
            lastNode = start;
            start = start.next;
        }

        System.out.println("Printing end to start");
        while (lastNode != null){
            System.out.println(lastNode.item + " ");
            lastNode = lastNode.prev;
        }

    }

    private class Node{
        String item;
        Node prev;
        Node next;

        Node(String item){
            this.item = item;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item='" + item + '\'' +
                    ", prev=" + prev +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyDoublyLinkedList myLink = new MyDoublyLinkedList();
        myLink.addToEnd("C");
        myLink.addToEnd("D");
        myLink.addToEnd("E");
        myLink.addToEnd("F");
        myLink.addToEnd("G");
        //myLink.print();

        MyDoublyLinkedList myLink1 = new MyDoublyLinkedList();
        myLink1.addToStart("1");
        myLink1.addToStart("2");
        myLink1.addToStart("3");
        myLink1.addToStart("4");
        myLink1.addToStart("5");
        myLink1.print();

    }
}
