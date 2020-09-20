package sessions.data_types;

public class PrimitiveDataTypes {
    public static void main (String [] args ) {
        byte age = 27;
        byte weith = 98;
        byte numberOfStudents = 50;

        System.out.println(age);
        System.out.println(weith);
        System.out.println(numberOfStudents);

        byte month = 12;
        byte day = 30;
        short year = 1993;

        System.out.print(month);
        System.out.print("/");
        System.out.print(day);
        System.out.print("/");
        System.out.println(year);

        // is the most wildly  used data type for whole numbers

        int kgPopulation = 6000000;
        System.out.print(kgPopulation);

        // cannot store it in int because out of bound(Range) we have to put L at the end when the number
        //bigger than int range

        long worldPopulation = 8000000000L;
        System.out.println(worldPopulation);

        int viewOfyoutobevideo = 2000000000;
        System.out.println(viewOfyoutobevideo);

        long gangamStyleyoutobeview = 3500000000L;
        System.out.println(gangamStyleyoutobeview);

        double gasPrise = 2.33;
        System.out.print("Gas prise for one gallon in KG:    som" + gasPrise);

        boolean isGasExpensive = true;
        boolean areTheyFake = false;
        System.out.println("  Is Gas expensive in KG "  + isGasExpensive   + "  The current prise "  +gasPrise );

        System.out.print(month);
        System.out.print("/");
        System.out.print(day);
        System.out.print("/");
        System.out.println(year);
    }
}
