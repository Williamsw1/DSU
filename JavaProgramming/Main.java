package JavaProgramming;

 class Person {
    String name;
    private int age=34;

    void show() {
        System.out.println("Name1: " + name + " Age1: " + age);
    }
    void set(int data_age)
    {
        age=data_age;
    }

    int get(){

        return age;
    }

}


public class Main {
    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.name="AAA";
        // obj1.age=4;
        // obj1.set(5);
        // System.out.println(obj1.get());
      obj1.show();
        
    }
    
}
