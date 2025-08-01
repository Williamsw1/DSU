package JavaProgramming;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackImpl {
    public static void main(String[] args) {
        // Create a stack using ArrayDeque
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements (LIFO)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        

        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop element
        System.out.println("Popped: " + stack.pop());

        // After pop
        System.out.println("Stack after pop: " + stack);

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
