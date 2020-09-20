package OOP;

public class myHouse {
    private String constractorCompany;
    private String typeOfBuilding;
    private String colorOfTheBuilding;
    private int totalRooms;

    public void actionCompany(String Abcd){
        constractorCompany =  Abcd;
    }
public void type (String flat,String apartment){
        typeOfBuilding = apartment;
}
public void color (String white){
        colorOfTheBuilding = white;
}
public myHouse (){
        this.totalRooms=6;
}
public void rooms (int a ){
        totalRooms = a;
}
}
