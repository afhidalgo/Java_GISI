public class Laptop {
    private String brand;
    private String processor;
    private int ram;

    // Constructor for essential fields
    public Laptop(String brand) {
        this.brand = brand;
    }

    // Setters for optional or modifiable fields
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }
}
