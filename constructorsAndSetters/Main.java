public class Main {
    public static void main(String[] args) {
        // Create a laptop object with essential data
        Laptop laptop = new Laptop("Dell");

        // Set additional properties later
        laptop.setProcessor("Intel i7");
        laptop.setRam(16);

        // Print laptop details
        System.out.println("Brand: " + laptop.getBrand());           // Output: Dell
        System.out.println("Processor: " + laptop.getProcessor());   // Output: Intel i7
        System.out.println("RAM: " + laptop.getRam());               // Output: 16

        // Create a car object with essential data
        Car car = new Car("Toyota");
        car.setModel("Corolla");
        car.setYear(2020);

        // Print car details
        System.out.println("Car Make: " + car.getMake());            // Output: Toyota
        System.out.println("Car Model: " + car.getModel());          // Output: Corolla
        System.out.println("Car Year: " + car.getYear());            // Output: 2020

        // Create a person object
        Person person = new Person("John", 30);

	Person persondef = new Person();

        // Print person details
        System.out.println("Person Name: " + person.getName());      // Output: John
        System.out.println("Person Age: " + person.getAge());        // Output: 30

	//Print defualt
	System.out.println("The default person name is: " + persondef.getName());
	System.out.println("The default person age is : " + persondef.getAge());

	//Print class
	System.out.println("The default print is:" + person.toString());
    }
}
