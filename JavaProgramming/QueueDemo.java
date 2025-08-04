package JavaProgramming;
import java.util.Scanner;

class Queue {
    private int front, rear, capacity, size;
    private int[] queue;

    // Constructor
    Queue(int size) {
        capacity = size;
        front = 0;
        rear = -1;
        this.size = 0;
        queue = new int[capacity];
    }

    // Enqueue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert " + value);
            return;
        }
        rear++;
        queue[rear] = value;
        size++;
        System.out.println(value + " enqueued.");
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int value = queue[front];
        front++;
        size--;
        return value;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    // isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // isFull
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Display Queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
} 

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(5); // size 5 queue

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Front element: " + q.peek());

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // should work
        q.enqueue(70); // should overflow
        q.display();

        sc.close();
    }
}
