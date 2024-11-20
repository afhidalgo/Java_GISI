package domain;
public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method for salary calculation
    public abstract double calculateSalary();
}
