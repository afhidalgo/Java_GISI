import java.util.ArrayList;

public class Company {
    private ArrayList<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
    private ArrayList<PartTimeEmployee> partTimeEmployees = new ArrayList<>();

    public void addFullTimeEmployee(FullTimeEmployee employee) {
        fullTimeEmployees.add(employee);
    }

    public void addPartTimeEmployee(PartTimeEmployee employee) {
        partTimeEmployees.add(employee);
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;

        // Calculate salaries for full-time employees
        for (FullTimeEmployee employee : fullTimeEmployees) {
            totalSalary += employee.calculateSalary();
        }

        // Calculate salaries for part-time employees
        for (PartTimeEmployee employee : partTimeEmployees) {
            totalSalary += employee.calculateSalary();
        }

        return totalSalary;
    }
}
