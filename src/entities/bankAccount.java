package entities;

public class bankAccount {
    private final int accountId;
    private String accountHolder;
    private double balance;

/* Construtores */
    public bankAccount(int accountId, String accountHolder, double balance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

/* Getters e Setters */
    public int getAccountId(){
        return accountId;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }
/* Métodos */
    public void withdraw(double withdraw){
        balance -= withdraw;
        balance -= 5;
    }

    public void deposit(double deposit){
        balance += deposit;
    }
    public String toString(){
        return "Account " + getAccountId() + "," + " Holder: " + getAccountHolder() + ", " + "Balance: $ " + String.format("%.2f", getBalance());
    }
}
