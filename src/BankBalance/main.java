package BankBalance;

import StorageCalculator.Product;

import java.util.Locale;
import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int id = sc.nextInt();
        sc.nextLine(); // consumir a linha pendente para passar para o proximo executavel

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n?) ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(name, id, initialDeposit);
        } else {
            account = new Account(name, id);
        }

        System.out.println("Account Data:");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account Data:");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account Data:");
        System.out.println(account);


        sc.close();
    }
}
