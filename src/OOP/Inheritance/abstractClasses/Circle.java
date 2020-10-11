package OOP.Inheritance.abstractClasses;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        this.radius =1.0;
    }
    public Circle(double radius){
        this.radius =radius;
    }

    public Circle(String color, boolean filled){
        super(color,filled);
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius =radius;
    }


    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    double getPerimeter(){
        return 2* Math.PI * radius;
    }

}
