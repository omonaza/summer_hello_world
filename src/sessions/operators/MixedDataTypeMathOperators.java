package sessions.operators;

public class MixedDataTypeMathOperators {

    public static void main (String [] args ) {

        System.out.println(100/1.0);
        // look the differences of result, it converts first to double
        // than caries out division
        System.out.println(100/1);

       // int result = 250/0.11; we can't convert it,bc it has a decimal point in int
        // we can try this way
        int result = 250/(int)5.11; // or the same way as this one
        int result1 = (int) (250/5.11); // by putting numbers in paranticies
        // question whi did i get two different numbers, when everything was the same

        System.out.println(result);
        System.out.println(result1);

        double result3 = 9 / 5 * 20.1; // correct answer is 36.18

        System.out.println( result3); // result is 20.1
        // question is it recommended to use for calculation
        // in real life mixed calculation with int and double



        double length = 9.5;
        float lengthInFloat = (float)length;
        int lengthInInt = (int)length;
        int sizeInInt = 11;

        double sizeInDouble = sizeInInt;
        double anExperimemtalDoubleNum = 7896.123456789012345;
        float precisionExperimentNumber = (float)anExperimemtalDoubleNum;
        long someLongNumber = 1234567890965765123l;
        int numberFromLong = (int)someLongNumber;


        System.out.println("I am double length "+length);
        System.out.println("I am converted to int length "+lengthInInt);
        System.out.println("I am float length "+lengthInFloat);
        System.out.println("----------DOuble to Float experiment------------------");
        System.out.println("I am a double with more precision "+anExperimemtalDoubleNum);
        System.out.println("I am a converted to float from double "+precisionExperimentNumber);
        System.out.println("----------Long to Int experiment------------------");
        System.out.println("I am a long number "+someLongNumber);
        System.out.println("I am a converted to int from long "+numberFromLong);
        System.out.println("----------float double int experiment------------------");
        System.out.println("I am a result "+result);
        System.out.println("I am a result1 "+result1);


    }
}
