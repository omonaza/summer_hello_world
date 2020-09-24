package OOP;

import java.util.ArrayList;

public class Student {
   private String firstName,lastName;
   private String email;
   private ArrayList<Course> courses = new ArrayList<>();
   private int numberOfcourses;

   public Student(String firstName,String lastName,String emailAddress){
       this.firstName = firstName;
       this.lastName=lastName;
       this.email = emailAddress;
       this.numberOfcourses = courses.size();
   }
    public void addCourse (Course course){
     this.courses.add(course);
     this.numberOfcourses++;
 }
 public void removeCourse(Course course){
       this.courses.remove(course);
       this.numberOfcourses--;
 }
 public void updateGrade (Course course,int grade){
    for (Course c : this.courses){
        if(c.equals(course)){
         course.setGrades(grade);
        }
    }
 }

 public double calculateGradeAverage(){
   double sum = 0.0;
   for(Course c : this.courses){
       sum+=c.getGrades();
   }
   return sum / this.numberOfcourses;
 }
public String toString (){
       String result = this.firstName + " " +this.lastName + " " + this.email;
       for (Course c : this.courses){
           result+=c.toString()+"\n";
       }
       return result;
}


}
