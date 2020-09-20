package sessions.arrays;

public class ArraysExercises1 {
    public static void printIntArray (int [] numberArray ) {
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(" the index is " +i  +" and the value inside is " +numberArray[i]);
        }


    }
    public static void main(String[] args) {
        int [] numbersArrays = new int [10];
        numbersArrays[7] = 200000;
        numbersArrays[1]= 199999999;
         printIntArray(numbersArrays);


         String [] nameOfStudents = new String[12];
         nameOfStudents [1] = "Azamat , Juide , Irina etc";
         nameOfStudents [2] = "u can write other student's name ";
         nameOfStudents [6] = " in other arrays " ;
         nameOfStudents [10] = " look closely , and study not hard ";
         nameOfStudents [11] = "byt smart ";
        System.out.println("The name of student in array is " +nameOfStudents[1]);


        final int NUMBER_OF_MONTH = 12;

        String [] numberOfMonth = new String[NUMBER_OF_MONTH];
         numberOfMonth [1] = "January";
         numberOfMonth [2] = "this final constant";
         numberOfMonth [11] = "so be careful";


        int[] studentGrades = new int[20];
        studentGrades[0] = 50;
        studentGrades[4] = 89;
        studentGrades[4] = 100;

        System.out.println("the values in 4th index is "+ studentGrades[4]);


        for (int i = 0 ; i <numbersArrays.length; i++){
            System.out.println( "["+i+"]" + "  and the value "+numbersArrays[i]);

            String [] animals = {"dog " , "cat ", "dug" , "horse" , "sheep" };
            int [] daysOfWeek = {1,2,3,4,5,6,7,8,9,10};

            System.out.println("The size of the array in animals is "+ animals.length);


            for (int j = 0 ; j < animals.length; j++) {

                System.out.println("The index is "+j+ " the value inside is "+animals[j]);

                int a = daysOfWeek [3] + daysOfWeek [2];
                System.out.println("Before increment "+daysOfWeek[1]);
                daysOfWeek[1]++;
                System.out.println("after increment "+daysOfWeek[1]);
                printIntArray(daysOfWeek);

            }






        }



    }
}
