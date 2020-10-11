package oopHomeWork;

public class Circle {
    private double radius;
    public String color ;

    public Circle(){
        radius =1.0;
        color = "red";

    }

    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

  public double getArea(){
        return radius * radius * Math.PI;
  }

    public void setRadius(double radius) {
        this.radius = radius;
    }

   public String getColor(){
        return this.color;
   }
   public void setColor(String color){
        this.color =color;
   }
}
