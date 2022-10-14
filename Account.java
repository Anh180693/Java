package assignment_2;

public class Account {
    int Id;
    String name;
    int balance;

    public  Account(){

    }
     public  Account(int Id, String name, int balance){
        this.Id = Id;
        this.name = name;
        this.balance = balance;
     }
    public int getId(){
        return  Id;
    }
    public void setId(){
        this.Id = Id;
    }
     public String getName(){
        return  name;
     }
     public void setName(){
        this.name = name;
     }

    public int getBalance(){
        return  balance;
    }
    public void setBalance(){
        this.balance = balance;
    }

    public int credit(int x){
   do{
       System.out.println("Nhap lai x so duong : ");
        }while (x<0);
        return this.getBalance()+x;
    }

    public void debit(int y){
        if(y > this.getBalance())
            System.out.println("Thanh toan khong thanh cong !");
        else
            System.out.println("Thanh toan thanh cong !");
    }

    public  Account tranferTo(Account f , int x){
        if(this.getBalance() < x){
            System.out.println("Giao dich khong thanh cong");
        }
         int z = f.getBalance() + x;
            Account y = new Account(Id,name,z);
         return y;
    }
}


