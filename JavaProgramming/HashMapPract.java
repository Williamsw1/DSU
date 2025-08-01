package JavaProgramming;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapPract {
    public static void main(String[] args) {
        HashMap<String, Integer> marksMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        // Adding student marks
        marksMap.put("Anjali", 85);
        marksMap.put("Rahul", 92);
        marksMap.put("Sneha", 78);
        marksMap.put("Vikram", 90);
        // Display all student marks
        System.out.println("Student Marks:");
        for (String name : marksMap.keySet()) {
            System.out.println(name + " : " + marksMap.get(name) + " marks");
        }

        // Search student mark
        System.out.print("\nEnter student name to check marks: ");
        String student = sc.nextLine();

        if (marksMap.containsKey(student)) {
            System.out.println(student + "'s marks: " + marksMap.get(student));
        } else {
            System.out.println("Student not found!");
        }

        sc.close();
    }
}
