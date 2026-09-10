package BankBalance;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private int id;
    private String name;
    private double balance;
    private final List<Transaction> transactions = new ArrayList<>();


    public Account(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    public boolean withdraw(double amount) {
        if (amount + 5 > balance){
            return false;
        }
        balance -= amount + 5;
        transactions.add(new Transaction("Withdraw", amount));
        transactions.add(new Transaction("Fee", 5));
        return true;
    }

    public void showTransactions() {
        System.out.println(" ----- TRANSACTION HISTORY -----");

        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
        System.out.println("------------------------");
    }

    public String toString() {
        return "Account "
                + id
                + ", Holder: "
                + name
                + ", Balance: $"
                + balance;
    }
}
