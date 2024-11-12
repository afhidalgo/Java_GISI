public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for the fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Overriding toString() for easier printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Overriding equals to compare based on name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}
