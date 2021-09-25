package collectionframework;

public class MyStackUsingArray {
    static final int MAX = 10;
    int top;
    int arr[] = new int[MAX]; // MAX is size of array (0 to MAX-1)

    MyStackUsingArray(){
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == MAX-1;
    }
    public boolean push(int val){
        if(isFull()){
            System.out.println("Stack is full!");
            return false;
        }

        arr[++top] = val;
        return true;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top--];
    }

    public void print(){
        for (int i = top; i >= 0 ; i--) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
    MyStackUsingArray stack = new MyStackUsingArray();
        System.out.println("Pushed elements:");
    stack.push(1);
    stack.push(3);
    stack.push(5);
    stack.push(8);

    stack.print();

        System.out.println("Popping now: ");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
