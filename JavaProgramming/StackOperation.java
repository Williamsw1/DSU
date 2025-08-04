package JavaProgramming;
import java.util.Scanner;
class Stack {
    private int top;
    private int capacity;
    private int[] stack;
    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow-can not push");

        } else {
            stack[top++] = value;
            System.out.println(value + " pushed to the stack");
        }
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int peek() {
         if (isEmpty()) {
            System.out.println("Stack is empty");
           return -1;
        } 
        else {
        return stack[top];
        }
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
           return -1;
        } 
        else {
            return stack[top--];
        }
    }

}

public class StackOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int n=sc.nextInt();
        Stack mystack = new Stack(n);
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);

        mystack.display();
        System.out.println("Top element is: " + mystack.peek());
        mystack.display();


        System.out.println("Popped element is: "+mystack.pop());
        mystack.display();



    }

}
