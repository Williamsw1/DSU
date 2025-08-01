package  JavaProgramming;

public class Animal1 {
    String name;
    int age;

    void show() {
        System.out.println("Name1: " + name + " Age1: " + age);
    }

    public static void main(String[] args) {

        Animal1 obj1 = new Animal1();
        Animal2 obj2 = new Animal2();
        obj2.name="Tiger";
        obj2.age=5;
        obj1.show();
        obj2.show();

       
    }

}
