package OOP;

public class circleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(1.0,"blue");


        System.out.println("color " +circle3.getColor() + " radius " + circle3.getRadius());

        System.out.println("radus "+circle1.getRadius()+" area "+circle1.getArea());
        System.out.println("radus "+circle2.getRadius()+" area "+circle2.getArea());



        circle3.setColor("cyan");
        circle3.setRadius(4.0);

        System.out.println("color " +circle3.getColor() + " radius " + circle3.getRadius());


    }
}
