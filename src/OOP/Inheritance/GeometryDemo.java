package OOP.Inheritance;

public class GeometryDemo {
    public static void main(String[] args) {
        Circle c = new Circle(3, "black");
        Circle c1 = new Cylinder(5, "red", 8);

        System.out.println(c);
        System.out.println(c1);

        System.out.println(c.getArea()+ " -- circle");
        System.out.println(c1.getArea()+" --> cylinder");
    }
}
