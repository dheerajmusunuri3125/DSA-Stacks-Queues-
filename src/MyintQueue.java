public class MyintQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public MyintQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue - Add element at rear
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = value;
        size++;
    }

    // Dequeue - Remove and return front element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int value = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    // Peek - View front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queueArray[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get current size
    public int getSize() {
        return size;
    }

    // Clear the queue
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
    }
}
