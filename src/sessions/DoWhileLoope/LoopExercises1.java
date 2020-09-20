package sessions.DoWhileLoope;

public class LoopExercises1 {

    public static int multipleTable (int num ) {
        int counter = 0;
        for (;counter <=10 ; counter ++) {

        } return num * counter;

    }
    public static void MultipleTable (){
        int num = 1 ;
        for (int counter = 0 ; counter <=12 ; counter++){
            System.out.println(counter + "x" +num + " = " +(num*counter));
        }
    }

    public static void main(String[] args) {
        System.out.println(multipleTable(1));
        MultipleTable();
    }
}
