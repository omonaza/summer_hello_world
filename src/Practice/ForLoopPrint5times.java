package Practice;

public class ForLoopPrint5times {
   // Write the code below to print 55555, 4444, 333, 22, 1 with each on a different line.
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--){
            for (int j = 0; j < i; j ++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
