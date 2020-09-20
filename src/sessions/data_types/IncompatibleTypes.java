package sessions.data_types;

public class IncompatibleTypes {
    public static void main (String [] args) {
        // we can't assign double or decimal point numbers to whole numbers
        // bc it's all about the boxes, imagine containers, with
        // different sizes, you can't put big container into small one
        // which is why, we should learn the size of data types by hart

        //double myNum1= 12.3;
        //int myNum2 = myNum1;


       // int num1 = 6;
       // long num2 = num1L; // doesn't comply . see the example
        // but luckily we have a way to convert it into each other
        // example of how to do it is given below
        // this rule is called explicitly type casting
        int num3 = 6;
        long num4 = (int)num3;
        System.out.println("explicitly type casting "+num3);

        double myDouble = 20.35;
         long myLong =(long) myDouble;
         System.out.println("explicitly type casting" +myDouble);

         // we have also implicit type casting
        // when we convert smaller data byte to the bigger data type
        // without explicit type casting rule
        int yourInt = 56;
        double yourDouble = yourInt;

        System.out.println("implicit type casting " +yourInt);




    }
}
