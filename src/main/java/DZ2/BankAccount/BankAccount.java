package DZ2.BankAccount;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public int getBalance(){
        return this.balance;
    }
    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    public int deposit(int x){
        return this.balance = this.balance + x;
    }
    public int withdraw(int x){
        return this.balance = balance - x;
    }

    public void printBalance(){
        System.out.println("Владелец: " + getOwner() + ", баланс: " + getBalance());
    }

}
