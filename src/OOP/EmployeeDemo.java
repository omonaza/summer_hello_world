package OOP;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", "Smith", 100);
        System.out.println(employee.toString());

        employee.raiseSalary(10);
        System.out.println(employee.toString());
        System.out.println(employee.getAnnualSalary());
    }
}
