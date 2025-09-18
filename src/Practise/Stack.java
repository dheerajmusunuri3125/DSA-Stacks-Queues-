package Practise;
public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor
    public Stack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    // Push - Add element
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    // Pop - Remove and return top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

    // Peek - Return top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Return number of elements
    public int size() {
        return top + 1;
    }

    // Clear the stack
    public void clear() {
        top = -1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

