package OOP.Inheritance;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee em = new Employee("John","Jonatan",new String[]{"sdd","sad","sad"},25);
        Employee em1 = new Developer("Aza","Omon");
        Employee em2 = new Testers("Uha","Noor"); // i could not print out the version of selenium in employee object
        Testers t = new Testers("ABc","Dfg");     // here i can print out

        System.out.println(em1);
        System.out.println(em2);

        System.out.println("DevSalary is " +em1.getBaseSalary());
        System.out.println("testerSalary is " +em2.getBaseSalary());
       System.out.println(t.getSeleniumVersion());


    }

}
