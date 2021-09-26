package collectionframework;

public class MyQueueUsingLinkedList {
    private QNode front, rear;

    public MyQueueUsingLinkedList(){
        front = rear = null;
    }

    public void enqueue(int val){
        QNode newNode = new QNode(val);
        if(rear == null){
            front = rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public  int dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int val = front.val;
        front = front.next;

        if(front == null){
            rear = null;
        }
        return  val;
    }

    private class QNode{
        int val;
        QNode next;
        QNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        MyQueueUsingLinkedList queue = new MyQueueUsingLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());// should return the queue as empty
    }

}
