package lv.rvt;

public class Account {


    private double balance;
    private String owner;

    public Account(String owner , double balance){
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit (double amount){
        this.balance = this.balance+amount;
    }

    public void withdraw(double amount){
        this.balance = this.balance-amount;
    }

    public double balance(){
        return this.balance;
    }

    @Override
    public String toString(){
        return this.owner+ "balance: "+ this.balance;
    }
    public static void main (String[] args){

        Account polinasAccount = new Account("Polinas account", 100.00);
        
        System.out.println("Initial state");
        System.out.println(polinasAccount);
        
        polinasAccount.withdraw(20);
       
        System.out.println("End state");
        System.out.println(polinasAccount);
           
    }
}
