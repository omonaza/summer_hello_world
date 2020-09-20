package sessions.if_statement;

public class ClassWithMirlan {

    public static void main(String[] args){
        int effort = 10;
        effort = 10;
        if (effort > 10) {
            effort = 90;
            int bonus = 100;
            System.out.println("effort is good!");
            if (effort == 11) {
                bonus =100+90;
                effort =91;
                System.out.println("effort is excellent!");
            } else {
                bonus = bonus + effort;
            }
        } else {
            if (effort == 11)
                System.out.println("strange effort is good and not good!");
            System.out.println("effort is not good!");
        }
    }

}
