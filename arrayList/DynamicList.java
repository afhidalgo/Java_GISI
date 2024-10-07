import java.util.ArrayList;
import java.util.Scanner;

public class DynamicList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String item = scanner.nextLine();
                    items.add(item);
                    System.out.println(item + " added to the list.");
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    if (items.remove(removeItem)) {
                        System.out.println(removeItem + " removed from the list.");
                    } else {
                        System.out.println(removeItem + " not found in the list.");
                    }
                    break;
                case 3:
                    System.out.println("Items in the list:");
                    for (String listItem : items) {
                        System.out.println(listItem);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
