package OOP.Inheritance.abstractClasses;

public abstract class Shape {

    private String color;
    private Boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = true;
    }

  public Shape (String color, boolean filled){
        this.color=color;
        this.filled=filled;

  }

   public String getColor(){
        return this.color;
   }

   public void setColor(String color){
        this.color=color;
   }

   public Boolean getFilled(){
        return this.filled;
   }
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
