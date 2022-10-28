package assignment_2;

public class Account {
    private int Id;
    private String name;
    private double balance;

    public  Account(){

    }
     public  Account(int Id, String name, double balance){
        this.Id = Id;
        this.name = name;
        this.balance = balance;
     }
    public int getId(){
        return  Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
     public String getName(){
        return  name;
     }
     public void setName(String name){
        this.name = name;
     }

    public double getBalance(){
        return  balance;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void credit(int x){
        setBalance(getBalance()+ (x>0?x:0));
    }

    public void debit(int y){
       setBalance(getBalance() - (y>0&&getBalance()>=y?y:0));
    }

    public  void transferTo(Account f , int x){
        f.setBalance(f.getBalance() + (x>0&&getBalance()>=x?x:0));
        this.debit(x);
    }
}


