package OOP.Inheritance.abstractClasses;

public class ShapeDemo {
    public static void main(String[] args) {
   Shape [] shapes = new Shape[5];

      shapes[0] =  new Circle("blue",false);
      shapes[1]= new Rectangle();
      shapes[2] = new Square("blue",true,5.0);
      shapes[3]= new Circle();


        for (Shape s: shapes) {
            System.out.println(s);
            System.out.println("area: "+s.getArea());
            System.out.println("perimeter: "+s.getPerimeter());
        }


    }
}
