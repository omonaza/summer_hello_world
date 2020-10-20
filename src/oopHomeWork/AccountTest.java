package oopHomeWork;

public class AccountTest {
    public static void main(String[] args) {
        Account abc = new Account("employee","John",300);
        System.out.println(abc.getId());
        System.out.println(abc.getName());
        System.out.println();


        Account abc1 = new Account("employee1","John1",2000);
        System.out.println(abc1.getName());
        System.out.println(abc1.getId());
        System.out.println(abc1.getBalance());
        abc1.credit(1000);
        System.out.println(abc1.getBalance());
        abc1.debit(500);
        System.out.println(abc1.getBalance());
        abc1.transferTo(abc,500);
        System.out.println(abc.getBalance());
        System.out.println(abc1.getBalance());


    }

}
