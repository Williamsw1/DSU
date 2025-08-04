package JavaProgramming;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;

    // 1. Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 2. Insert at end
    public void insertAtEnd(int data) {
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


    // 3. Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // 4. Delete at end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

   
    // 5. Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 6. Search an element
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // 7. Length of the list
    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Test the linked list
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        
        list.insertAtBeginning(5);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
       
        list.display(); // 5 → 10 → 20 → null

        list.deleteAtBeginning();
        list.display(); // 10 → 15 → 20 → null

        list.deleteAtEnd();
        list.display(); // 10 → 15 → null

        System.out.println("Length: " + list.length()); // 1
        System.out.println("Search 10: " + list.search(10)); // true
        System.out.println("Search 99: " + list.search(99)); // false
    }
}

























// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// public class LinkedList {
//     Node head;

//     // 1. Insert at beginning
//     public void insertAtBeginning(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//     }

//     // 2. Insert at end
//     public void insertAtEnd(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }

//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     // 3. Insert at position
//     public void insertAtPosition(int data, int position) {
//         if (position == 0) {
//             insertAtBeginning(data);
//             return;
//         }

//         Node newNode = new Node(data);
//         Node temp = head;
//         for (int i = 1; i < position && temp != null; i++) {
//             temp = temp.next;
//         }

//         if (temp == null) {
//             System.out.println("Position out of bounds.");
//             return;
//         }

//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     // 4. Delete at beginning
//     public void deleteAtBeginning() {
//         if (head == null) {
//             System.out.println("List is empty.");
//             return;
//         }
//         head = head.next;
//     }

//     // 5. Delete at end
//     public void deleteAtEnd() {
//         if (head == null) {
//             System.out.println("List is empty.");
//             return;
//         }
//         if (head.next == null) {
//             head = null;
//             return;
//         }

//         Node temp = head;
//         while (temp.next.next != null) {
//             temp = temp.next;
//         }
//         temp.next = null;
//     }

//     // 6. Delete at position
//     public void deleteAtPosition(int position) {
//         if (position == 0) {
//             deleteAtBeginning();
//             return;
//         }

//         Node temp = head;
//         for (int i = 1; i < position && temp != null; i++) {
//             temp = temp.next;
//         }

//         if (temp == null || temp.next == null) {
//             System.out.println("Position out of bounds.");
//             return;
//         }

//         temp.next = temp.next.next;
//     }

//     // 7. Display the list
//     public void display() {
//         if (head == null) {
//             System.out.println("List is empty.");
//             return;
//         }

//         Node temp = head;
//         System.out.print("Linked List: ");
//         while (temp != null) {
//             System.out.print(temp.data + " → ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // 8. Search an element
//     public boolean search(int key) {
//         Node temp = head;
//         while (temp != null) {
//             if (temp.data == key) return true;
//             temp = temp.next;
//         }
//         return false;
//     }

//     // 9. Length of the list
//     public int length() {
//         int count = 0;
//         Node temp = head;
//         while (temp != null) {
//             count++;
//             temp = temp.next;
//         }
//         return count;
//     }

//     // Test the linked list
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

//         list.insertAtEnd(10);
//         list.insertAtEnd(20);
//         list.insertAtBeginning(5);
//         list.insertAtPosition(15, 2);
//         list.display(); // 5 → 10 → 15 → 20 → null

//         list.deleteAtBeginning();
//         list.display(); // 10 → 15 → 20 → null

//         list.deleteAtEnd();
//         list.display(); // 10 → 15 → null

//         list.deleteAtPosition(1);
//         list.display(); // 10 → null

//         System.out.println("Length: " + list.length()); // 1
//         System.out.println("Search 10: " + list.search(10)); // true
//         System.out.println("Search 99: " + list.search(99)); // false
//     }
// }
