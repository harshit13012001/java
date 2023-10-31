import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeStreamExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "harshit", 25000.0));
        employees.add(new Employee(2, "prince", 18000.0));
        employees.add(new Employee(3, "arvind", 30000.0));
        employees.add(new Employee(4, "lakshya", 22000.0));
        employees.add(new Employee(5, "sachin", 19000.0));

        // Use Stream API to filter employees with salaries > 20000
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(employee -> employee.getSalary() > 20000)
                .collect(Collectors.toList());

        // Print the filtered employees
        System.out.println("Employees with salaries > 20000:");
        highSalaryEmployees.forEach(employee ->
                System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary())
        );
    }
}
