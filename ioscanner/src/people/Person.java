package people;
public class Person{
	String name;
	String surname1;
	String surname2;
	int age;

	public Person(String name, String surname1, String surname2, int age){
		this.name = name;
		this.surname1 = surname1;
		this.surname2 = surname2;
		this.age = age;
	}

	public String getName(){
		return this.name;
	}
	public String getSurname1(){
		return this.surname1;
	}
	public String getSurname2(){
		return this.surname2;
	}
	public int getAge(){
		return this.age;
	}

	public String toString(){
		return "The person names is" + this.getName() + "with first surname " + this.getSurname1() +", second surname" +
				this.getSurname2() + " and age" + this.getAge();
	}
}


