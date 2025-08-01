package JavaProgramming;
import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String[] args) {
        // Create an ArrayList of city names

        // List<String> list = new LinkedList<>();
        ArrayList<String> cities = new ArrayList<>();

        // Add cities
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Delhi");

        // Display all cities
        System.out.println("City List:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Access a city by index
        System.out.println("\nCity at index 2: " + cities.get(2));

        // Update a city
        cities.set(1, "Hyderabad");
        System.out.println("\nUpdated City List:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Remove a city
        cities.remove("Delhi");
        System.out.println("\nCity List after removing Delhi:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Check if city exists
        if (cities.contains("Chennai")) {
            System.out.println("\nChennai is in the list.");
        }

        // Size of the list
        System.out.println("\nTotal cities: " + cities.size());
    }
}