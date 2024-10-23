import java.util.Scanner;
import people.Person;

public class ConsoleLoader {
    public Person loadPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter first surname:");
        String surname1 = scanner.nextLine();
        System.out.println("Enter second surname:");
        String surname2 = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        return new Person(name, surname1, surname2, age);
    }

    public static void main(String[] args) {
        ConsoleLoader consoleLoader = new ConsoleLoader();
        Person person = consoleLoader.loadPerson();
        System.out.println("Person loaded from console:");
        System.out.println(person); // Assuming `Person` class has a meaningful `toString` method
    }
}
