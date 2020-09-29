package OOP.Inheritance;

public class Developer extends Employee{

    public Developer(String firstName, String lastName){
        super(firstName,lastName,new String[]{"develop", "implement", "execute"},20);

    }

    @Override
    public Double getBaseSalary(){
        Double devSalary = super.getBaseSalary() + (super.getBaseSalary() * getPercentage()/100);
        return devSalary;
    }
}
