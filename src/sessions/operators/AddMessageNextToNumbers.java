package sessions.operators;

public class AddMessageNextToNumbers {

    public static void main (String [] args) {

        String carMake = "Ferrari";
        int year = 2020;
        int mileAge= 0;
         // plus sign after String appends(adds)
        //  the value of  next variable
        // to the end of String
        System.out.println("Car Make: " +carMake +".");
        System.out.println("Car Year: " +year);
        System.out.println("Mileage:  " +mileAge);
        System.out.println();

        double SpoonePrice = 0.99;
        int amountOfSpoons = 4;
        double totalDue = amountOfSpoons*SpoonePrice;

         double forkPrice = 1.99;
         int amountOfForks= 6;
         double totalDueOfForks=forkPrice*amountOfForks;


        System.out.println("Total Price for " +amountOfSpoons +" Spoons $" +totalDue);
        System.out.println("Total Price for " +amountOfForks + " Forks $" +totalDueOfForks );

         // parentheses calculates first, and than goes String
        // or you can put String after numbers, this works only with plus sign
         // for multi placation and division java automatically calculates by math rules
        System.out.println("total " +(totalDueOfForks+totalDue));
         System.out.println(totalDueOfForks+totalDue + " Total");


    }
}
