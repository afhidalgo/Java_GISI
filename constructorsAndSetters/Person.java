public class Person {
    private String name;
    private int age;
    //Defualt
    public Person(){
	    this.name = "JJ";
	    this.age = 0;
    }
    //toSting override
    @Override
    public String  toString(){
	    return "My name is:" + this.name + "and my age is:" + this.age;
    }

    // Constructor to initialize essential fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
