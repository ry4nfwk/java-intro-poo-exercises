package entities;

public class bankAccount {
    private final int accountId;
    private String accountHolder;
    private double balance;

/* Construtores */
    public bankAccount(int accountId, String accountHolder) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
    }

    public bankAccount(int accountId, String accountHolder, double initialDeposit) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
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
    public void withdraw(double amount){
        balance -= amount + 5;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public String toString(){
        return "Account " + getAccountId() + "," + " Holder: " + getAccountHolder() + ", " + "Balance: $ " + String.format("%.2f", getBalance());
    }
}
