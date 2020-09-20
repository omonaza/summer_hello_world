package OOP;



import java.util.Random;

public class CardDemo {
    public static void main(String[] args) {
        Random rm = new Random();
        Card myCard = new Card(rm.nextInt(4),rm.nextInt(14));


        System.out.println(myCard);
        System.out.println();
        for(int i = 0; i <=10 ; i ++){
            Card tempCard = new Card(rm.nextInt(4),rm.nextInt(14));
            System.out.println(tempCard);
            System.out.println(myCard.equals(tempCard));
        }
    }
}
