package OOP.Inheritance;

public class Testers extends Employee{


    private String SeleniumVersion = "2.3.x";

    public Testers(String firstName,String lastName){
        super(firstName,lastName,new String[]{"testing", "unit testing", "integration testing"},25);

    }

    public String getSeleniumVersion() {
        return SeleniumVersion;
    }

    public void setSeleniumVersion(String seleniumVersion) {
        SeleniumVersion = seleniumVersion;
    }
    @Override
    public Double getBaseSalary() {
        Double testerSalary = super.getBaseSalary()+(super.getBaseSalary()*getPercentage()/100);
        return testerSalary;
    }

}
