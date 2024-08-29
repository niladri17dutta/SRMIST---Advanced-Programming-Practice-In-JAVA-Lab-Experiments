// Abstract class Employee
abstract class Employee {
    protected String name;
    protected int employeeId;

    // Constructor for Employee
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method calculateSalary
    abstract double calculateSalary();

    // Abstract method getEmployeeDetails
    abstract String getEmployeeDetails();
}

// Subclass RegularEmployee that extends Employee
class RegularEmployee extends Employee {
    private final double baseSalary;
    private final double bonus;

    // Constructor for RegularEmployee
    public RegularEmployee(String name, int employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementation of calculateSalary for RegularEmployee
    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    // Implementation of getEmployeeDetails for RegularEmployee
    @Override
    String getEmployeeDetails() {
        return "Regular Employee: " + name + ", ID: " + employeeId + ", Salary: $" + calculateSalary();
    }
}

// Subclass ContractEmployee that extends Employee
class ContractEmployee extends Employee {
    private final double contractAmount;

    // Constructor for ContractEmployee
    public ContractEmployee(String name, int employeeId, double contractAmount) {
        super(name, employeeId);
        this.contractAmount = contractAmount;
    }

    // Implementation of calculateSalary for ContractEmployee
    @Override
    double calculateSalary() {
        return contractAmount;
    }

    // Implementation of getEmployeeDetails for ContractEmployee
    @Override
    String getEmployeeDetails() {
        return "Contract Employee: " + name + ", ID: " + employeeId + ", Salary: $" + calculateSalary();
    }
}

// Subclass HourlyEmployee that extends Employee
class HourlyEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    // Constructor for HourlyEmployee
    public HourlyEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary for HourlyEmployee
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Implementation of getEmployeeDetails for HourlyEmployee
    @Override
    String getEmployeeDetails() {
        return "Hourly Employee: " + name + ", ID: " + employeeId + ", Salary: $" + calculateSalary();
    }
}

// Main class to test the implementation
public class Q1CEmployeeDetails {
    public static void main(String[] args) {
        Employee regularEmployee = new RegularEmployee("Alice", 101, 50000, 5000);
        Employee contractEmployee = new ContractEmployee("Bob", 102, 60000);
        Employee hourlyEmployee = new HourlyEmployee("Charlie", 103, 20, 160);

        System.out.println(regularEmployee.getEmployeeDetails());
        System.out.println(contractEmployee.getEmployeeDetails());
        System.out.println(hourlyEmployee.getEmployeeDetails());
    }
}
