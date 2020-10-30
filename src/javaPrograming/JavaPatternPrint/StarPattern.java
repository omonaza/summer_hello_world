package javaPrograming.JavaPatternPrint;

public class StarPattern {
    //  1. Right Triangle Star Pattern
    public static void main(String[] args) {
        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //i for rows and j for columns
        //row denotes the number of rows you want to print
        int i, j, row1 = 6;
        //Outer loop work for rows
        for (i = 0; i < row1; i++) {
            //inner loop work for space
            for (j = 2 * (row1 - i); j >= 0; j--) {
                //prints space between two stars
                System.out.print(" ");
            }
            //inner loop for columns
            for (j = 0; j <= i; j++) {
                //prints star
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }
    }


}


