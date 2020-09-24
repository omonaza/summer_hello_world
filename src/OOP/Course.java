package OOP;

public class Course {
    private String name;
    private int grades;
    private int credits;

    public Course(String name, int credits, int grades){
        this.name = name;
        this.grades=grades;
        this.credits=credits;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getCredits(){
        return this.credits;
    }
    public void setCredits(int credits){
        this.credits=credits;
    }
    public int getGrades(){
        return this.grades;
    }
    public void setGrades(int grades){
        this.grades=grades;
    }
  public String toString(){
        return this.name + " " +this.credits + " " +this.grades;
  }

}
