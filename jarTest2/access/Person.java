package access;
public class Person{
	String name = "Ana";
	int age=20;

	public static void main(String[] args){
		int a = 20;
		Person person = new Person();
		System.out.println("The integer a is : " + a);
		System.out.println("My name is :" + person. name);
	}

	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}


class Bank{
	int savings;
	int credit;

	Bank(){
		this.savings = 0;
		this.credit = 0;
	}
	Bank(int savings, int credit){
		this.savings = savings;
		this.credit = credit;
	}

	int addInt(int a, int b){
		return a+b;
	}
}

