package sessions.operators.increment;

public class IncrementAndDecrement {

    public static void main(String[] args) {


        int num1 = 100; // counter
        int num2 = 200;
        num1++;        // post increment is the most used one in practice
        num2--;         // Azamat be careful about this, pay more attention
        // below some examples has given have a look at them and think


        System.out.println("nu1++ is " + num1);
        System.out.println("nu2-- is " + num2);
        System.out.println(num1);
        int num3 = 100;
        int num4 = num3++; // post increment var ++
        // keep the value in the whole statement, in the next statement


        System.out.println(num4);
        System.out.println(num3);


        int num5 = 100;
        int num6 = ++num5; // pre increment ++ var
        // update the value in the current statement immediately
        // look at the example carefully
        System.out.println(num6);
        System.out.println(num5); // look no matter how many times i print it out
        System.out.println(num6); // yhe value updated and never changes, unless if
        System.out.println(num5); // i change the value myself from the beginning,or by using
        // arithmetic operators like + - * /


        int number = 100;
        number = ++num1;

        System.out.println(number);


        double doubleNum = 100.99;
        System.out.println(doubleNum++); // the value stays the same as it's given first
        System.out.println(doubleNum); // the value changes in next statement look at example

        long mylong = 12546l;
        mylong++; // look at this now

        System.out.println(mylong);


        int value1 = 3;
                        //4          //4          //3
        int value2 = ++value1 * 5 / value1-- + --value1;

        System.out.println(value2);
        System.out.println(value1);


        int apples = 0;
        int grapes = 10;
        apples += 2; // apples = apples + 2; --> 2
        grapes -= 2; // grapes = grapes - 2; -> 8
        apples++;   //  apples = apples + 1;  --> 3 post increment
        grapes--;   //  grapes = grapes - 1; --> 7
        //System.out.println(apples);
        //System.out.println(grapes);
        // Pre increment and post increment
        System.out.println("apples are :" + apples);
        System.out.println("grapse are :" + grapes);
        System.out.println("apples are pre inc:" + (++apples));
        System.out.println("grapse are pre dec:" + (--grapes));
        System.out.println("apples are :" + apples);
        System.out.println("grapse are :" + grapes);
        System.out.println("apples are post inc:" + (apples++));
        System.out.println("grapse are post dec:" + (grapes--));
        System.out.println("apples are :" + apples);
        System.out.println("grapse are :" + grapes);
        // Post increment and pre increment exercises
        int peaches = 7;
        int bananas = 5;
        int basket = bananas++ + 1;
        System.out.println("bananas "+ bananas + "peaches "+peaches+" basket is "+basket);
        basket = basket + --peaches;
        System.out.println("bananas "+bananas+ "peaches "+ peaches + " basket is "+basket);
        int mathsGrade = 50;
        int physicsGrade = 75;
        int sum = --physicsGrade + mathsGrade++; //74 + 50
        int sum1 = mathsGrade-- + physicsGrade++; //51-- + 74
        int totalSum = sum1 + sum;
        System.out.println("sum: "+sum+"\nsum1 :"+ sum1 +"\nphysicsGrade: "+ physicsGrade+
                "\nmathsGrade: "+ mathsGrade+"\ntotalSum:"+totalSum);
        //75 50
        int x = 5;
        int y = ++x * 5 / x-- + --x;
        System.out.println(y);

    }
}
