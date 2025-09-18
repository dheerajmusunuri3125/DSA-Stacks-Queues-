package Practise;
public class StackString {
    private String[] stackArray;
    private int top;
    private int capacity;

    // Constructor
    public StackString(int size) {
        capacity = size;
        stackArray = new String[capacity];
        top = -1;
    }

    // Push - Add element to the top
    public void push(String value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push \"" + value + "\"");
            return;
        }
        stackArray[++top] = value;
    }

    // Pop - Remove and return the top element
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return null;
        }
        return stackArray[top--];
    }

    // Peek - Return top element without removing it
    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stackArray[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Return number of elements in the stack
    public int size() {
        return top + 1;
    }

    // Clear the stack
    public void clear() {
        top = -1;
    }

    // Display the stack elements
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

