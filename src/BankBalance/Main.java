package BankBalance;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-----  Welcome to Pimentech Bank!  -----");

        System.out.print("Enter account number: ");
        int id = sc.nextInt();
        sc.nextLine(); //

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        Account account = new Account(name, id);

        System.out.println("Welcome Sr(a) " + name);

        int option = 0;
        while (option != 5) {
            System.out.println("What do you want to do?");
            System.out.println(" " +
                    " [1] Deposit" +
                    " [2] Withdraw" +
                    " [3] Check balance " +
                    " [4] Transaction history" +
                    " [5] Exit");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter a deposit value: ");
                    double depositValue = sc.nextDouble();
                    account.deposit(depositValue);
                    System.out.println("Successful deposit!");
                    break;
                case 2:
                    System.out.print("Enter a withdraw value: ");
                    double withdrawValue = sc.nextDouble();
                    if (account.withdraw(withdrawValue)){
                        System.out.println("Successful withdraw!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                case 3:
                    System.out.println("Updated account data: ");
                    System.out.println(account);
                    break;
                case 4:
                    account.showTransactions();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Thank you!!!!");
                    System.out.println("Finish....");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        sc.close();
    }
}
