import principal.*;
import domain.*;
public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.addEmployee(new FullTimeEmployee("Alice", 5000));
        company.addEmployee(new PartTimeEmployee("Bob", 20, 80));

        double totalSalary = company.calculateTotalSalary();
        System.out.println("Total salary paid by the company: $" + totalSalary);
    }
}
