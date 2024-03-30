public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public double getSalary() {
        return salary;
    }
    
        public static void main(String[] args) {
            // Creating an instance of Employee
            Employee employee = new Employee("abc", 12345, 50000);
    
            // Displaying employee details
            System.out.println("Employee Details:");
            employee.displayEmployeeDetails();
    
            // Creating an instance of DevOpsEngineer
            DevOpsEngineer devOpsEngineer = new DevOpsEngineer("xyz", 54321, 60000, 10000);
    
         // Displaying DevOpsEngineer details
            System.out.println("\nDevOps Engineer Details:");
            devOpsEngineer.displayEmployeeDetails();
        
    }
    
}
