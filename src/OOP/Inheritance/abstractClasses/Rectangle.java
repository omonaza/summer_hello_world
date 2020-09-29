package OOP.Inheritance.abstractClasses;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
   public Rectangle(String color,Boolean filled,double width,double length){
        super(color,filled);
        this.width=width;
        this.length = length;
   }
  public double getWidth(){
        return this.width;
  }
  public void setWidth(double width){
        this.width = width;
  }

  public double getLength(){
        return this.length;
  }
  public void setLength(double length){
        this.length=length;
  }


    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2*length + 2*width;
    }
//
//    @Override
//    public String toString() {
//        return "Rectangle {"+
//    }
}
