class MyStringQueue {
    private String[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor
    public MyStringQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue - Add element to rear
    public void enqueue(String value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue \"" + value + "\"");
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = value;
        size++;
    }

    // Dequeue - Remove and return element from front
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return null;
        }
        String value = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    // Peek - View front element without removing
    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
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

    // Clear queue
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
