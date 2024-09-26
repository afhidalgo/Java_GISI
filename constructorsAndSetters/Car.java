public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor with essential field
    public Car(String make) {
        this.make = make;
    }

    // Setters to modify fields after object creation
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
