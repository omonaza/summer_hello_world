package OOP;

import org.junit.Test;
import static org.junit.Assert.*;
public class circleTest {
    @Test
    public void emptyConstrictor(){
        Circle  c1 = new Circle();
        c1.getColor();
        assertEquals(c1.getColor(),"red");
        assertEquals(c1.getRadius(),1.0,0.0);


    }

    @Test
   public void oneParameterCircleConstructorTest(){
        Circle  c1 = new Circle(3.1);
        assertEquals(c1.getColor(),"red");
        assertEquals(c1.getRadius(),3.1,0.0);
        assertNotNull(c1);

    }
    @Test
    public void  setRaduisAndColorTest(){
        Circle c1 = new Circle();
        assertEquals(c1.getColor(),"red");
        assertEquals(c1.getRadius(),1.0,0.0);
        c1.setColor("pink");
        c1.setRadius(3.0);
        assertEquals(c1.getRadius(),3.0,0.0);
        assertEquals(c1.getColor(),"pink");
        assertEquals(c1.getArea(),28.274333882308138,0.0);
    }

}
