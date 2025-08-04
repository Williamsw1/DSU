package JavaProgramming;

class Queue {
    private int front;
    private int rear;
    private int capacity;
    private int size;
    private int[] queue;
    // constructor

    public Queue(int size) {
        capacity = size;
        front = 0;
        rear = -1;
        this.size = 0;
        queue = new int[capacity];

    }
    //Enqueue 
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue overflow. Can not insert data anymore");
            return;
        }
        rear++;
        queue[rear]=value;
        size++;
        System.out.println(value+"enqued");

    }

    public boolean isFull(){
        return rear ==capacity-1;
    }
    //diplaying the result 
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue Elements: ");
            for(int i=front;i<=rear;i++){
                System.out.println(queue[i]);
            }

        }
    }
    public boolean isEmpty(){
        return size ==0;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];

    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is underflow. Can not dequeue");
            return -1;
        }
       int value= queue[front];
       front++;
       size--;
       return value;
    }


}

public class QueueImpl {
    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Front element is: "+q.peek());

        System.out.println("Dequeued: "+q.dequeue());
          q.display();

    }

}
