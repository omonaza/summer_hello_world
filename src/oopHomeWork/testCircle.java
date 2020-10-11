package oopHomeWork;

public class testCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle();
        c3.setRadius(5.0);
        System.out.println("radius is: " + c3.getRadius());
        System.out.println("The circle has radius of " + c3.getRadius() +" and area of " + c3.getArea());
        c3.setColor("White");
        System.out.println("color is: " + c3.getColor());
        c3.color="black";
        System.out.println(c3.getColor());

    }
}
