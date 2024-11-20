class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
	String age;
    Dog(String name , String age) {
        // Call parent class constructor
        super(name);
	this.age = age;
    }

    @Override
    void sound() {
        // Call parent class method
       // super.sound();
        System.out.println(name + " barks.");
    }
}

class Cat extends Animal {
	String age;
    Cat(String name , String age) {
        // Call parent class constructor
        super(name);
	this.age = age;
    }

    @Override
    void sound() {
        // Call parent class method
        // super.sound();
        System.out.println(name + " Meow.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "3");
        Cat cat = new Cat("Sunny", "3");
        //dog.sound();
        //cat.sound();
	makeAnimalSound(dog);
	makeAnimalSound(cat);
    }
    //Function to make any Animal object to make a sound
    public static void makeAnimalSound(Animal animal){
	    animal.sound():
    }

}
