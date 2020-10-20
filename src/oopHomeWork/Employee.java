package oopHomeWork;

public class Employee {
    private  int ID;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int ID,String firstName,String lastName,int salary){
        this.ID=ID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getID(){
        return this.ID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.firstName + " " +this.lastName;
    }
    public int getSalary(){
        return  this.salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getAnnualSalary(){
        return this.salary *12;
    }
    public void raiseSalary(int percent){
        this.salary += this.salary * Math.abs(percent)/100;
        System.out.println(this.salary);
    }
    public String toString(){
        return "Employee { "+"firstName is: " + firstName + " lastName is: " +lastName +" Employee ID is:  " +ID +" } ";
    }
}
