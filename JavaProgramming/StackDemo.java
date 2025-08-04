package JavaProgramming;
import java.util.Scanner;

class Stack {
    private int top;
    private int capacity;
    private int[] stack;

    // Constructor
    Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1; // initially stack is empty
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
} 
public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack myStack = new Stack(5); // stack of size 5

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.display();

        System.out.println("Top element is: " + myStack.peek());

        System.out.println("Popped element is: " + myStack.pop());
        myStack.display();

        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        myStack.push(70); // should give overflow
        myStack.display();

        sc.close();
    }
}
