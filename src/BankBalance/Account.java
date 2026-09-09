package BankBalance;

public class Account {

    private  int id;
    private String name;
    private double balance;


    public Account(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Account(String name, int id, double initialDeposit) {
        this.name = name;
        this.id = id;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public String toString() {
        return "Account "
                + id
                +", Holder: "
                + name
                +", Balance: $"
                +balance;
    }
}
