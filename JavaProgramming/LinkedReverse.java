package JavaProgramming;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedReverse {
    Node head;

    // Add a node at the end
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // Step 1
            current.next = prev;   // Step 2
            prev = current;        // Step 3
            current = next;        // Step 4
        }
        head = prev;
    }

    // Print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedReverse list = new LinkedReverse();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed List:");
        list.printList();
    }
}
