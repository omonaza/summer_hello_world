package oopHomeWork;

public class Rectangle {
private float length ;
private float width;

public Rectangle(){
    length = 1.0f;
    width = 1.0f;
}
public Rectangle(float length,float width){
    this.length=length;
    this.width=width;
}
public float getLength(){
    return length;
}
public void setLength(float length){
    this.length=length;
}
public float getWidth(){
    return width;
}
public void setWidth(float width){
    this.width=width;
}
public double getPerimeter(){
    return 2*(width + length);

}
public double getArea(){
    return width * length;
}
public String toString(){
    return "Rectangle {" +"Length " +length + " width " + width + "}";
}
}
