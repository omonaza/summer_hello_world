package OOP.Inheritance.abstractClasses;

public class Employee extends Person {
    private String firstName;

    @Override
    String getFirstName() {
        return "Employee FirstName :"+firstName;
    }

    @Override
    int getAge() {
        return 0;
    }

    @Override
    String getSpecies() {
        return null;
    }
}
