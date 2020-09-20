package sessions.operators;

public class ButterPriceCalculator {

    public static void main (String [] args ) {


        double butterPrise = 10.99;
        double serviceFee= 1.99;
        int taxPercent = 2; // 2% tax from butterPrice+serviceFee
        double tipPercent= 2.5;   // 2.5 % tax from butterPrice+serviceFee+tax

        double tax = (butterPrise + serviceFee) * taxPercent / 100;
        double totalWithOutTip = butterPrise + serviceFee + tax;
        double tip = ( totalWithOutTip * tipPercent / 100 );
        double total = totalWithOutTip + tip;

        System.out.println("Butter Total Price $" +total);

    }
}
