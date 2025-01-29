public class GenerateRepport  {


    public String generateReport(Employee employee) {
        return "Employee Report: " + employee.getName() + ", Role: " + employee.getRole() + ", Salary: " + employee.getSalary();
    }
}
