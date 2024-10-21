import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentGroups {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students (N)
        System.out.print("Enter the number of students (N): ");
        int N = scanner.nextInt();

        // List to hold student IDs (1 to N)
        List<Integer> students = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            students.add(i);
        }

        // Shuffle the students list to randomize the order
        Collections.shuffle(students);

        // Create groups
        List<List<Integer>> groups = new ArrayList<>();

        // Create as many groups of 3 as possible
        int index = 0;
        while (index + 3 <= students.size()) {
            List<Integer> group = students.subList(index, index + 3);
            groups.add(new ArrayList<>(group)); // Add a new group of 3 students
            index += 3;
        }

        // If there are 2 remaining students, create a group of 2
        if (index + 2 == students.size()) {
            List<Integer> group = students.subList(index, index + 2);
            groups.add(new ArrayList<>(group)); // Add a new group of 2 students
        }

        // Output the groups
        System.out.println("Generated groups:");
        for (int i = 0; i < groups.size(); i++) {
            System.out.println("Group " + (i + 1) + ": " + groups.get(i));
        }

        scanner.close();
    }
}
