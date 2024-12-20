import java.util.Date;
import java.util.Objects;

//Interface Drawable
interface Drawable {
	void Draw(); //Abstract method for drawing shapes
}

interface Resizable {
	void resize(double factor); //Abstract method for resizing
}

abstract class Shape implements Drawable, Resizable {
	private final int id; // Final variable (unique identifier)
	private String name; //Modifiable name
	private final Date createdDate; //Final variable

	//Constructor
	public Shape(int id, String name){
		this.id = id; //Assign unique ID
		this.name = name;
		this.createdDate = new Date(); //Assign creatiion date
	}

	public String getName(){
		return name;
	}
	//Setter for name
	public void setName(String name){
	       this.name = name;
	}

	//Getter for date
	public Date getTimeStamp(){
		return createdDate;
	}

	@Override
	public boolean equals(Object obj){

		Shape shape = (Shape) obj;
		return id == shape.id && name.equals(shape.name);

	}

	//@Override hasCode
	@Override
	public int hashCode(){
		return Objects.hash(id, name);
	}

}
final class Circle extends Shape{
	private double radius;
	//Constructor
	public Circle (int id, String name, double radius){
		super(id, name);
		this.radius = radius;
	}

	@Override
	public void draw(){
		System.out.println("Drawing a circle:" + getName()
	}

	@Override
	public void resize(double factor){
		radiud *= factor;
		System.out.println("Resized circle: " + getName() + "to radius"+radius) 
	}

} //Finish Circle

final class Rectangle extends Shape {
}

public class Main {
	public static void main(String[] args){
		Drawable d = new Circle(....);

	}

}

