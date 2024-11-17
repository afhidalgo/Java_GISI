abstract class Animal{
	String name;

	Animal(String name){
		this.name = name;
	}

	void displyInfo(){
		System.out.println("Animal name is: " + name);
	}

	abstract void makeSound();
	
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
		Dog firstDog = new Dog("Buddy", "2");
		firstDog.displyInfo();
		firstDog.makeSound();
	}
}

