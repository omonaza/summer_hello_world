package sessions.operators;

public class CompoundAssignmentOperators {

    public static void main (String [] args ) {

        int num1 = 10;
        int num2 = 50;

        num1=num1 + num2 ;
        num2=110 +num1 ; // 170, note, i reassign the value of num2

        System.out.println(num2);
        System.out.println(("Num1 After first addition " +num1));

        num2=num2+20 ;// 190

        System.out.println(num2);

          // when you are seeing the variables that you are trying to reassign the value of
          // in the right side of the = sign


        num2= num2+num2; // 190 + 190 = 380
         System.out.println(num2); // 380

        num2=num2 * num2 + num2 ;

        System.out.println(num2);


        double balance = 10000.0;
        double totalSpending= 0 ;

         totalSpending = 100.0;
         totalSpending = totalSpending+ 50.0 ; //totalSpending 100 + 50 = 150
         totalSpending= totalSpending + 25.0;   // totalSpending 150 + 25 = 175
        totalSpending=totalSpending+ 700 ;   // 875
              //10000 - 875 = 9125.0
        balance=balance-totalSpending;

         System.out.println("Balance " +balance);// 9125

          // compound assignment operators

        // + compound
        totalSpending+=100; // totalSpending=totalSpending + 100; ) same as before but + sign added
        totalSpending+=200 ;//  totalSpending=totalSpending + 200;= 1175.0

         System.out.println(totalSpending);

         //- compound
        balance-=totalSpending;

        System.out.println(" Balance " +balance); // same as before, look above

        //* compound,
        // passive income example

        int passiveIncome = 1 ;
         passiveIncome*=2;// could be passiveIncome= passiveIncome * 2; = 2

         System.out.println("1st Passive Income Results " +passiveIncome);

         //division



    }

}
