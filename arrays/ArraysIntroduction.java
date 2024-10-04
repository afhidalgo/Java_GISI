public class ArraysIntroduction {

    public static void main(String[] args) {
        // 1. One-Dimensional Arrays

        // Explanation: A one-dimensional array is a list of elements of the same type stored in a contiguous memory location.
        // You can think of it as a row of elements. The index of an array starts at 0.
        
        // Example 1: Declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};  // Array with 5 elements
        System.out.println("One-Dimensional Array:");
        
        // Accessing array elements using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " is: " + numbers[i]);
        }

        // Example 2: Modifying an array element
        numbers[2] = 100;  // Changing the value at index 2
        System.out.println("\nAfter modifying the element at index 2:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Example 3: Finding the sum of elements in an array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of elements in the array: " + sum);

        // 2. Two-Dimensional Arrays

        // Explanation: A two-dimensional array is like a matrix or a table with rows and columns.
        // It is essentially an array of arrays.

        // Example 4: Declaring and initializing a 2D array
        int[][] matrix = {
            {1, 2, 3},   // Row 0
            {4, 5, 6},   // Row 1
            {7, 8, 9}    // Row 2
        };
        
        System.out.println("\nTwo-Dimensional Array:");

        // Accessing elements in a 2D array using nested loops
        for (int i = 0; i < matrix.length; i++) {          // Looping over rows
            for (int j = 0; j < matrix[i].length; j++) {   // Looping over columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }

        // Example 5: Modifying an element in a 2D array
        matrix[1][1] = 50;  // Changing the value in row 1, column 1
        System.out.println("\nAfter modifying element at row 1, column 1:");
        for (int[] row : matrix) {      // Enhanced for loop to print the 2D array
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        // Example 6: Calculating the sum of all elements in a 2D array
        int totalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                totalSum += matrix[i][j];
            }
        }
        System.out.println("\nSum of all elements in the 2D array: " + totalSum);
    }
}
