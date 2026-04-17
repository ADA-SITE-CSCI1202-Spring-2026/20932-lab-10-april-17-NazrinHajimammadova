import java.util.*;
import java.util.function.Function;

class Employee {
    String firstName;
    String lastName;
    double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
}

public class Task2 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Liam", "Johnson", 7000));
        employees.add(new Employee("Emma", "Williams", 5500));
        employees.add(new Employee("Noah", "Taylor", 4800));

        // format function
        Function<Employee, String> formatCard =
                e -> "Name: " + e.getLastName() + ", " + e.getFirstName()
                        + " - Salary: $" + e.getSalary();

        // method reference
        Function<Employee, Double> salaryPicker = Employee::getSalary;

        for (Employee e : employees) {
            System.out.println(formatCard.apply(e));
            System.out.println("Salary extracted: $" + salaryPicker.apply(e));
        }
    }
}
