import java.util.ArrayList;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        // ---- THEORY: Arrays ----
        // Arrays in Java are fixed in size. You must specify the size of the array at the time of declaration,
        // and it cannot be changed once created. Arrays can store both primitive data types (e.g., int, char)
        // and objects (e.g., String, custom objects).

        // Example: Declaring and initializing an array of integers with a fixed size
        int[] numbersArray = new int[3];  // Array of fixed size 3
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;

        // Accessing elements in an array using a traditional for loop
        System.out.println("Array (Fixed Size):");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("numbersArray[" + i + "] = " + numbersArray[i]);
        }

        // Arrays are fixed in size, so we cannot add new elements beyond the specified size.
        // Uncommenting the next line will cause an ArrayIndexOutOfBoundsException
        // numbersArray[3] = 40;  // ERROR: Array size is fixed, cannot add more elements

        // ---- THEORY: ArrayList ----
        // ArrayList is a part of the Java Collections Framework and allows dynamic resizing.
        // Unlike arrays, you can add and remove elements from an ArrayList, and its size will grow or shrink automatically.
        // However, ArrayList can only store objects, so you must use wrapper classes (e.g., Integer, Double)
        // for primitive types (e.g., int, double).

        // Example: Declaring and initializing an ArrayList of integers with dynamic size
        ArrayList<Integer> numbersList = new ArrayList<>();  // ArrayList with dynamic size
        numbersList.add(10);  // Add elements to the ArrayList
        numbersList.add(20);
        numbersList.add(30);

        // Accessing elements in an ArrayList using a traditional for loop
        System.out.println("\nArrayList (Dynamic Size):");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.println("numbersList.get(" + i + ") = " + numbersList.get(i));
        }

        // We can add more elements to the ArrayList, unlike arrays
        numbersList.add(40);  // Add another element to the ArrayList
        System.out.println("\nAfter adding an element to ArrayList:");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.println("numbersList.get(" + i + ") = " + numbersList.get(i));
        }

        // We can also remove elements from the ArrayList
        numbersList.remove(1);  // Remove the element at index 1 (second element)
        System.out.println("\nAfter removing the element at index 1:");
        for (int i = 0; i < numbersList.size(); i++) {
            System.out.println("numbersList.get(" + i + ") = " + numbersList.get(i));
        }

        // ---- THEORETICAL COMPARISON ----
        // 1. Size:
        //    Arrays have a fixed size. You must specify the size at creation and cannot change it later.
        //    ArrayList can grow or shrink dynamically. It allows adding or removing elements at runtime.
        
        // 2. Type Support:
        //    Arrays can store both primitive types (e.g., int, char) and objects (e.g., String, custom classes).
        //    ArrayList can only store objects. You need to use wrapper classes like Integer for int, Double for double, etc.
        
        // 3. Methods and Functionality:
        //    Arrays have limited functionality. You can access elements using their index but cannot add, remove, or manipulate size.
        //    ArrayList provides several useful methods like add(), remove(), get(), size(), etc., to manage dynamic collections.
        
        // 4. Performance:
        //    Arrays generally provide better performance for accessing elements because of their fixed size.
        //    ArrayList may be slightly slower in performance due to dynamic resizing and overhead of managing elements.
        
        // 5. Multidimensional Support:
        //    Arrays support multidimensional arrays (e.g., int[][]) out of the box.
        //    ArrayList requires nested ArrayLists for multidimensional data structures (e.g., ArrayList<ArrayList<Integer>>).

        // ---- EXAMPLES ----
        
        // ---- Example 1: Multidimensional Arrays ----
        // You can create 2D arrays (arrays of arrays) with arrays
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\n2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ---- Example 2: Multidimensional with ArrayList ----
        // You can simulate multidimensional arrays with ArrayLists using nested ArrayLists
        ArrayList<ArrayList<Integer>> arrayListMatrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);

        arrayListMatrix.add(row1);
        arrayListMatrix.add(row2);
        arrayListMatrix.add(row3);

        System.out.println("\nNested ArrayList (Simulating 2D Array):");
        for (ArrayList<Integer> row : arrayListMatrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
