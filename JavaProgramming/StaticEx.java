package JavaProgramming;

class Counter {
    static int objectCount = 0; // static variable shared by all objects
    String name;

    // Constructor
    Counter(String n) {
        name = n;
        objectCount++; // increment static variable
        System.out.println("Object created: " + name + " | Total Objects: " + objectCount);
    }

    // Static method (optional)
  static void showTotalObjects() {
        System.out.println("Total number of objects created: " + objectCount);
    }
}

public class StaticEx {
    public static void main(String[] args) {
        Counter c1 = new Counter("First");
        Counter c2 = new Counter("Second");
        Counter c3 = new Counter("Third");
     

        // Static method can be called using class name
        Counter.showTotalObjects();
    
    }
}
