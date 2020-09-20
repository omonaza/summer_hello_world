package homeworks;

public class HomeWork7 {

    public static void main (String [] args ) {

        int a = -5;
        int b = 8;
        int c = 6;
        int result = a+b*c;
         System.out.println(result);

         int bookPrice = 55;
         int amountOfBooks = 9;
         int discount = 9;
         int total = (bookPrice + amountOfBooks) % discount;
         System.out.println(total);

         int serialNum = 20 ;
         int serialNum2 = -3 ;
         int serialNum3 = 5;
         int serialNum4 = 8 ;
         int combination = serialNum + serialNum2 * serialNum3 / serialNum4;
         System.out.println(combination);

         int myNum = 5;
         int myNum1 = 15;
         int myNum2 = 3;
         int myNum3 = 2;
         int myNum4 = 8;
         int myNum5 = 3;

         System.out.println(myNum + myNum1 / myNum2 * myNum3 - myNum4 % myNum5);



    }
}

