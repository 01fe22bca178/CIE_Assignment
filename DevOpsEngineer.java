public class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + getTotalSalary());
    }
}
