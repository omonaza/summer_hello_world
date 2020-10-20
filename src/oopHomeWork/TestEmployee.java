package oopHomeWork;

import oopHomeWork.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(5,"Azamat","Osmonbekov",1000);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        employee.raiseSalary(50);
        employee.setSalary(2000);
        System.out.println(employee.getSalary());
        employee.raiseSalary(20);
        System.out.println(employee.getFirstName());
        System.out.println(employee.toString());

    }
}
