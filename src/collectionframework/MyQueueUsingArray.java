package collectionframework;

public class MyQueueUsingArray {
    static final int MAX = 10;
    int arr[];
    int front, rear, size, capacity;

    MyQueueUsingArray(){
        this(MAX); // default constructor sets capacity to MAX
    }

    MyQueueUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = size = 0;
        rear = 0;
    }
    boolean isFull(){
        return size == capacity;
    }
    boolean isEmpty(){
        return size == 0;
    }
    public void enqueue(int val){
        if(isFull()){
            System.out.println("The queue is full");
            return;
        }
        arr[rear] = val;
        rear = rear + 1;
        size ++;
        System.out.println(val + " is added to queue");
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return Integer.MIN_VALUE;
        }
        size--;
        return arr[front++];

    }

    public static void main(String[] args) {
        MyQueueUsingArray que = new MyQueueUsingArray(4);
        que.enqueue(1);
        que.enqueue(2);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(5); // should print the queue is full

        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.dequeue()); // should return the queue is empty

    }
}
