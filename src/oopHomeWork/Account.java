package oopHomeWork;

public class Account {
    private String id ;
    private String name;
    private int balance= 0 ;

    public Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id,String name, int balance){
        this.id=id;
        this.name=name;
        this.balance= balance;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public int credit (int amount){
        return balance+=amount;
    }

    public int debit (int amount){
        if(amount<=balance){
            balance-=amount;
        }else {
            System.out.println("amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account abc , int amount){

        if(amount<=balance){
           abc.credit(amount);
        }else {
            System.out.println("amount exceeded balance");
        }
        return balance;
    }


}
