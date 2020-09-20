package OOP;

public class CarDemo {
    public static void main(String[] args) {
        Car subaru = new Car();
        subaru.setModel("forester");
        subaru.accelerate();
        System.out.println("model of subaru: "+subaru.getModel());


        Car vw = new Car();
        vw.setModel("beetle");
        System.out.println("model of vw: "+vw.getModel());

        Car nn = new Car();

        System.out.println("model of nn: "+nn.getModel());
        System.out.println("color: " +nn.getColor());

        Car toyota = new Car("blue", "Toyota Japan", 2021);
        System.out.println("color: "+toyota.getColor()+" manufacturer "+toyota.getManufacturer()+"" +
                " year "+ toyota.getYear());

    }
}
