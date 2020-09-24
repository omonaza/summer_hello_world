package OOP;

public class CourseManagementDemo {
    public static void main(String[] args) {


        Student John = new Student("John", "Smith", "john@gmail.com");
        Course courseJava = new Course(" Java programing", 9, 0);
        Course courseSoftSkills = new Course("Soft skills", 3, 0);
        Course courseTools = new Course("Tools", 3, 0);

        John.addCourse(courseJava);
        John.addCourse(courseSoftSkills);
        John.addCourse(courseTools);


        System.out.println(John);


        John.updateGrade(courseJava,95);
        John.updateGrade(courseSoftSkills,50);
        John.updateGrade(courseTools,45);

        System.out.println(John);

        System.out.println("Average is " +John.calculateGradeAverage());
    }
}
