package OOP.Inheritance;

import java.util.Arrays;

public class Employee {
    private String firstName;
    private String lastName;
    private String[] tasks;
    private int percentage;
    private Double baseSalary;


    public Employee(String firstName, String lastName, String[] tasks, int percentage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tasks = tasks;
        this.percentage = percentage;
        this.baseSalary = 1000.0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getTasks() {
        return tasks;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tasks=" + Arrays.toString(tasks) +
                '}';
    }
}
