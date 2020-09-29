package OOP.Inheritance;

import static java.lang.Math.PI;

public class Circle {
    private int radius;
    private String color;

 public Circle(int radius, String color){
     this.radius=radius;
     this.color=color;
 }
public int getRadius(){
     return this.radius;
}
public void setRadius(int radius){
     this.radius=radius;
}
public String getColor(){
     return this.color=color;
}
public void setColor(String color){
     this.color=color;
}
public Double getArea(){
 return Math.PI * radius * radius;
}

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + '}';
    }
}
