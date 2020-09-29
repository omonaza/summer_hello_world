package OOP.Inheritance.abstractClasses;

public class Student extends Person {

     private String firstName;

    @Override
    String getFirstName() {
      return "Student FirstName: " + firstName;

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
