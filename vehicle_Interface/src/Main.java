// Define the Vehicle interface
interface Vehicle {
    void start(); // Abstract method: must be implemented
    void stop();  // Abstract method: must be implemented
    int getSpeed(); // Abstract method: must be implemented
}

// Car class implements the Vehicle interface
class Car implements Vehicle {
    private int speed;

    @Override
    public void start() {
        System.out.println("Car is starting...");
        speed = 10;
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
        speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}

// Bicycle class implements the Vehicle interface
class Bicycle implements Vehicle {
    private int speed;

    @Override
    public void start() {
        System.out.println("Bicycle is starting...");
        speed = 5;
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopping...");
        speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}

// Incomplete class: Does not implement all methods of the Vehicle interface
abstract class Hoverboard implements Vehicle {
    // No implementation of start(), stop(), or getSpeed()

    public void hover() {
        System.out.println("Hoverboard is hovering...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of Car and Bicycle
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        // Interact with the objects
        car.start();
        System.out.println("Car speed: " + car.getSpeed());
        car.stop();

        bicycle.start();
        System.out.println("Bicycle speed: " + bicycle.getSpeed());
        bicycle.stop();

        // Uncommenting the following line will cause an error, as Hoverboard cannot be instantiated
        // Hoverboard hoverboard = new Hoverboard();
    }
}
