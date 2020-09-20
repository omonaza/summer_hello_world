package OOP;

public class Car {
    protected int year;
    private String model;
    public String color;
    private int speed;
    String manufacturer;


    public Car() {
        this.model = "chevrolet";
        this.color = "blue";
        this.speed = 0;
    }
    public Car(String color, String manufacturer, int year){
        this.color = color;
        this.manufacturer = manufacturer;
        this.year = year;
    }
    public Car(String color, int year){
        this(color, "", 2020 );
    }
    public void setModel(String model){
        this.model = model;
        int counter = 0;
    }
    public void setManufacturer(String man){
        manufacturer = man;

    }
    public void accelerate() {
        speed++;
    }

    public void slowDown() {
        speed--;
    }
    public String getModel(){
        return this.model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }


}
