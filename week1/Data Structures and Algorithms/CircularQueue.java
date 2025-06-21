package LinkedList;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element: " + element);
            return;
        }

        // Circular increment of rear
        rear = (rear + 1) % capacity;

        if (front == -1) { // If first element is added
            front = rear;
        }

        queue[rear] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }

        int dequeuedElement = queue[front];

        // Circular increment of front
        front = (front + 1) % capacity;
        size--;

        if (size == 0) { // If the queue becomes empty
            front = -1;
            rear = -1;
        }
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    public String displayQueue() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(queue[(front+i)%capacity]+",");
        }
        sb.deleteCharAt(sb.length() -1);
        return sb+"]";
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(8);
        System.out.println(q.displayQueue());
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(25);
        q.enqueue(30);
        q.enqueue(35);
        System.out.println(q.displayQueue());
        q.dequeue();
        q.dequeue();
        System.out.println(q.displayQueue());
        System.out.println(q.peek());
    }
}
