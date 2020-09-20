package Methods;

import java.util.Scanner;

public class VoidMethod {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name = inputName.nextLine();
        PrintMyName(name);
        // System.out.println("Your Name is"+name); i could use this one too, as i have to use every time to print out
        // something i can use void method for all cases.

        System.out.println("Please Enter the first number");
        int number1 = inputName.nextInt();
        System.out.println("Please Enter the Second number");
        int number2 = inputName.nextInt();
        addTwoNuNumbers(number1, number2);
        //System.out.println("\"The added numbers of\" " + number1 + " and " + number2 + " = " + number1 + number2);

        System.out.println("Please Enter Two Numbers");
        // int addNum1 = inputName.nextInt();
        // int addNum2 = inputName.nextInt();
        // int result = number1+number2;
        Calculator(number1, number2);

        isEvenOrOddNumber(1);
        isEvenOrOddNumber(2);
        isEvenOrOddNumber(3);
        isEvenOrOddNumber(4);
        isEvenOrOddNumber(5);
        isEvenOrOddNumber(6);
        isEvenOrOddNumber(7);
        isEvenOrOddNumber(8);
        isEvenOrOddNumber(9);
        isEvenOrOddNumber(10);

    }

    public static void PrintMyName(String name) {
        System.out.println("The name is " + name);
    }

    public static void addTwoNuNumbers(int num1, int num2) {
        System.out.println("The added numbers are " + num1 + " and " + num2 + " = " + num1 + num2);
    }

    public static void Calculator(int addNumber1, int addNumber2) {
        System.out.println("The sum of " + addNumber1 + " and " + addNumber2 + " = " + (addNumber1 + addNumber2));
        System.out.println("The Product of " + addNumber1 + " and " + addNumber2 + " = " + (addNumber1 * addNumber2));
        System.out.println("The division of " + addNumber1 + " and " + addNumber2 + " = " + (addNumber1 / addNumber2));
        System.out.println("The Difference of " + addNumber1 + " and " + addNumber2 + " = " + (addNumber1 - addNumber2));
        System.out.println("The max of " + addNumber1 + " and " + addNumber2 + " = " + Math.max(addNumber1, addNumber2));

    }

    public static void isEvenOrOddNumber(int EvenOrOddNumber) {
       if (EvenOrOddNumber % 2 == 0) {
           String result = EvenOrOddNumber +" Is An Even Number";
          // System.out.println(result); I could use it
           PrintMyString(result);
       }
       else
          // System.out.println(EvenOrOddNumber +" is An Odd Number"); i could use it
        PrintMyString(EvenOrOddNumber +" is An Odd Number");


      /*  int num1 = 9;
        System.out.println("I am before incrementing: "+num1);
        incrementNum(num1);
        System.out.println("I am after incrementing: "+num1);
    }
       Attention have a closer look at this example Azamat, It's Important to know

    public static void incrementNum(int a){
        System.out.println("I am increment method!");
        a = a + 1;
        System.out.println("I am a , and my values is "+a);*/
    }





    public static void PrintMyString (String text){
        System.out.println(text);
    }
}

