package OCA;

public class testDemo {

    public static void main(String[] args) {
        Test check1 = new Test();
        Test check2 = new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.i);

    }
}
