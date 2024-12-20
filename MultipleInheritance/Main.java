import java.util.Date;
import java.util.Objects;
import java.util.ArrayList;

// Interface 1: Drawable
interface Drawable {
    void draw(); // Abstract method for drawing shapes
}

// Interface 2: Resizable
interface Resizable {
    void resize(double factor); // Abstract method for resizing shapes
}

// Abstract Class: Shape (implements multiple interfaces)
abstract class Shape implements Drawable, Resizable {
    private final int id; // Final variable (unique identifier)
    private String name; // Modifiable name
    private final Date createdDate; // Final variable (creation timestamp)

    // Constructor
    public Shape(int id, String name) {
        this.id = id; // Assign unique ID
        this.name = name;
        this.createdDate = new Date(); // Assign creation timestamp
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for creation timestamp
    public Date getTimeStamp() {
        return createdDate;
    }

    // Overriding equals() to compare shapes logically
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Class type check
        Shape shape = (Shape) obj;
        return id == shape.id && name.equals(shape.name); // Compare ID and name
    }

    // Overriding hashCode() to ensure consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

// Final Class: Circle
final class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor
    public Circle(int id, String name, double radius) {
        super(id, name);
        this.radius = radius;
    }

    // Implementation of draw() from Drawable interface
    @Override
    public void draw() {
        // Polymorphism: Runtime (dynamic dispatch for draw())
        System.out.println("Drawing a Circle: " + getName() + " with radius " + radius);
    }

    // Implementation of resize() from Resizable interface
    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Resized Circle: " + getName() + " to radius " + radius);
    }
}

// Final Class: Rectangle
final class Rectangle extends Shape {
    private double width; // Width of the rectangle
    private double height; // Height of the rectangle

    // Constructor
    public Rectangle(int id, String name, double width, double height) {
        super(id, name);
        this.width = width;
        this.height = height;
    }

    // Implementation of draw() from Drawable interface
    @Override
    public void draw() {
        // Polymorphism: Runtime (dynamic dispatch for draw())
        System.out.println("Drawing a Rectangle: " + getName() + " with dimensions " + width + "x" + height);
    }

    // Implementation of resize() from Resizable interface
    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("Resized Rectangle: " + getName() + " to dimensions " + width + "x" + height);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store different shapes
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add shapes to the list
        shapes.add(new Circle(1, "Circle One", 5.0));
        shapes.add(new Rectangle(2, "Rectangle One", 4.0, 6.0));
        shapes.add(new Circle(3, "Circle Two", 3.0));

        // Call a method to draw all shapes
        drawAllShapes(shapes);

        // Call a method to resize all shapes
        resizeAllShapes(shapes, 2.0);

        // Draw the shapes again to see the updated dimensions
        drawAllShapes(shapes);
    }

    // Method to draw all shapes (Polymorphism: Runtime, dynamic dispatch)
    public static void drawAllShapes(ArrayList<Shape> shapes) {
        System.out.println("Drawing all shapes:");
        for (Shape shape : shapes) {
            shape.draw(); // Polymorphic call to draw() method
        }
    }

    // Method to resize all shapes (Polymorphism: Runtime, dynamic dispatch)
    public static void resizeAllShapes(ArrayList<Shape> shapes, double factor) {
        System.out.println("\nResizing all shapes by factor: " + factor);
        for (Shape shape : shapes) {
            shape.resize(factor); // Polymorphic call to resize() method
        }
    }
}



