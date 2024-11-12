package application; 
import domain.D;
import java.util.ArrayList; 
public class StartProgram {
    public static void main(String[] args) { 
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
                
        // Add some items to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Original list: " + fruits);

        // Remove an item by index
        fruits.remove(1); // Removes "Banana"
        System.out.println("After removing by index (1): " + fruits);

        // Remove an item by value
        fruits.remove("Orange"); // Removes "Orange"
        System.out.println("After removing by value ('Orange'): " + fruits);

        // Remove all items that match a certain condition (e.g., items starting with "A")
        fruits.removeIf(fruit -> fruit.startsWith("A"));
        System.out.println("After removing items that start with 'A': " + fruits);



        ArrayList<D> al = new ArrayList<>(); 
        al.add(new D(1));
        al.add(new D(3));
        al.add(new D(5));
        al.add(new D(7));
        System.out.println("Arrays before deleting" + al);
        al.remove(new D(5)); 
        System.out.println("Arrays after deleting" + al);
    }
}
