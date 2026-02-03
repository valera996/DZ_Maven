package DZ2.BankAccount;

public class Main {
    public static void main(String[] args){

        BankAccount ac1 = new BankAccount("Игорь",0);


        ac1.deposit(3000);
        ac1.withdraw(1500);

        ac1.printBalance();

    }
}
