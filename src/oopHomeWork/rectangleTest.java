package oopHomeWork;

public class rectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("The rectangle has length of " + r1.getLength() +" and width of " +r1.getWidth());
        r1.setLength(3.0f);
        r1.setWidth(2.0f);
        System.out.println("The rectangle has length of after updating " + r1.getLength() +" and width of " +r1.getWidth());
        Rectangle r2 = new Rectangle(5.0f,4.0f);
        System.out.println("The rectangle has length of " + r2.getLength() +" and width of " +r2.getWidth());
        System.out.println("Area of rectangle is "+ r2.getArea());
        System.out.println("The Perimeter of Rectangle is " +r2.getPerimeter());
        System.out.println(r2.toString());



    }
}
