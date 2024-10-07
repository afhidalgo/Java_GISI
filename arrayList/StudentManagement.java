import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.add(name);
                    System.out.println("Student added: " + name);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    if (students.remove(removeName)) {
                        System.out.println("Student removed: " + removeName);
                    } else {
                        System.out.println("Student not found: " + removeName);
                    }
                    break;
                case 3:
                    System.out.println("List of students:");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
