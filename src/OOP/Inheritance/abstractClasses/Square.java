package OOP.Inheritance.abstractClasses;

public class Square extends Shape{
    private double side;

    public Square(){
        this.side = 1.0;
    }
    public Square (Double side){
        this.side=side;
    }

    public Square(String color , boolean filled,Double side){
        super(color,filled);
        this.side=side;
    }

    public double getSide(){
       return this.side = side;
    }

    public void setSide(double side){
        this.side=side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4*side;
    }

    public String toString(){
      return  "Square{" + "side = " + " } " + side +super.toString();
    }
}
