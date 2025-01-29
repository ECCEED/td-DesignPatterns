public class CalculAug {
    public void applyRaise(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + employee.getSalary() * (percentage / 100);
        employee.setSalary(newSalary);
    }
}
