abstract class Animal{
       String name;
	Animal (String name){
	 this.name = name;
	}

	abstract void makeSound();

	void displayInfo(){
		System.out.println("Animal name is: " + name);
	}

}
class Dog extends Animal{
	String age;
	Dog (String name, String age){
		super(name);
		this.age = age;
	}

	@Override
	void makeSound(){
		System.out.println("Dogs love barking");
	}

}

class Main{
	public static void main(String[] args){
		Dog dog = new Dog ("Buddy", "3");
		dog.displayInfo();
		dog.makeSound();

	}

}
